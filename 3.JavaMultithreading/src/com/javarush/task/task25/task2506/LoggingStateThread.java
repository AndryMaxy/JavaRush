package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
        private Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
     //   setDaemon(true);
    }

    @Override
    public void run() {

        String last = "";
        while (true){
            String cur = thread.getState().toString();
            if (cur.equals(State.TERMINATED.toString())){
                System.out.println(cur);
                break;
            }
            if (!(cur.equals(last))) {
                System.out.println(cur);
                last = cur;
            }
        }
    }
}
