package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {

    public static void main (String[] args) throws Exception{
     //   System.out.println(new Solution(4));
        OutputStream out = new FileOutputStream("f:\\solution.txt");
        InputStream in = new FileInputStream("f:\\solution.txt");
        ObjectOutputStream oout = new ObjectOutputStream(out);
        Solution s1 = new Solution(5);
        Solution s2 = new Solution(6);
        oout.writeObject(s1);
        oout.writeObject(s2);
        out.close();
        oout.close();
        ObjectInputStream objIn = new ObjectInputStream(in);
        System.out.println(objIn.readObject());
        System.out.println(objIn.readObject());
        in.close();
        objIn.close();
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String  string;

    public Solution(int temperature) {
        this.currentDate = new Date(4543543423995L);
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
