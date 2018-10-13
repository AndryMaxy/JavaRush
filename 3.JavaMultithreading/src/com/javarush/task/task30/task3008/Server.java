package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            String name = "";
            try {
                ConsoleHelper.writeMessage("New connection: " + socket.getRemoteSocketAddress());
                Connection newCon = new Connection(socket);
             //   socket.connect(newCon.getRemoteSocketAddress());
                name = serverHandshake(newCon);
                connectionMap.put(name,newCon);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED,name));
                sendListOfUsers(newCon,name);
                serverMainLoop(newCon,name);
            } catch (ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Connection failed");
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Connection failed");
            }
            connectionMap.remove(name);
            sendBroadcastMessage(new Message(MessageType.USER_REMOVED,name));
            ConsoleHelper.writeMessage("Connection closed");
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            connection.send(new Message(MessageType.NAME_REQUEST));
            Message msg = connection.receive();
            while (msg.getType() != MessageType.USER_NAME) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                msg = connection.receive();
            }
            while (msg.getData() == null || msg.getData().equals("")) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                msg = connection.receive();
            }
            while (connectionMap.containsKey(msg.getData())) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                msg = connection.receive();
            }
            connectionMap.put(msg.getData(), connection);
            connection.send(new Message(MessageType.NAME_ACCEPTED));
            return msg.getData();
        }

        private void sendListOfUsers(Connection connection, String userName) throws IOException{
            for (Map.Entry<String, Connection> m : connectionMap.entrySet()) {
                if (!(m.getKey().equals(userName))){
                    connection.send(new Message(MessageType.USER_ADDED,m.getKey()));
                }
            }
        }
        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{
            while (true) {
                Message msg = connection.receive();
                if (msg.getType() == MessageType.TEXT) {
                    String message = String.format("%s: %s",userName,msg.getData());
                    Message msgNew = new Message(MessageType.TEXT,message);
                    sendBroadcastMessage(msgNew);
                } else ConsoleHelper.writeMessage("Error");
            }
        }

    }

    public static void main(String[] args) {
        int port = ConsoleHelper.readInt();
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            ConsoleHelper.writeMessage("Server runs");
            while (true) {
                new Handler(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sendBroadcastMessage(Message message) {
        try {
            for (Map.Entry<String, Connection> m : connectionMap.entrySet()) {
                m.getValue().send(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ConsoleHelper.writeMessage("Sending failed");
        }
    }
}
