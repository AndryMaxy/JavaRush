package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception{
        //start here - начни
        SimpleDateFormat sdp = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat sdp2 = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
        String c = "-c";
        String u = "-u";
        String d = "-d";
        String i = "-i";
        String m = "м";
        String w = "ж";
        if (args[0].equals(c)) {
            if (args[2].equals(m)) {
                Date date = sdp.parse(args[3]);
                allPeople.add(Person.createMale(args[1],date));
                System.out.println(allPeople.size()-1);
            } else if (args[2].equals(w)) {
                Date date = sdp.parse(args[3]);
                allPeople.add(Person.createFemale(args[1],date));
                System.out.println(allPeople.size()-1);
            }
        } else if (args[0].equals(u)) {
            if (args[3].equals(m)) {
                Date date = sdp.parse(args[4]);
                allPeople.set(Integer.parseInt(args[1]),Person.createMale(args[2],date));
            } else if (args[3].equals(w)) {
                Date date = sdp.parse(args[4]);
                allPeople.set(Integer.parseInt(args[1]),Person.createFemale(args[2],date));
            }
        } else if (args[0].equals(d)) {
            Person p = allPeople.get(Integer.parseInt(args[1]));
            p.setBirthDay(null);
            p.setName(null);
            p.setSex(null);
        } else if (args[0].equals(i)) {
            Date dd = allPeople.get(Integer.parseInt(args[1])).getBirthDay();
            String s = sdp2.format(dd);
            Date date = sdp2.parse(s);
            Person p = allPeople.get(Integer.parseInt(args[1]));
            String sex = p.getSex().equals(Sex.MALE) ? "м" : "ж";
            System.out.println(p.getName() + " " + sex + " " + s);
        }

    }
}
