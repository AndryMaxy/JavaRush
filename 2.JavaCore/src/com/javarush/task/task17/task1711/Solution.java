package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();



    public static void main(String[] args) throws Exception {

        allPeople.add(Person.createMale("Ivanov Ivan", new Date()));
        allPeople.add(Person.createMale("Ivanov Petr", new Date()));

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, args);

         {

            SimpleDateFormat sdp = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            SimpleDateFormat sdp2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

            String c = "-c";
            String u = "-u";
            String d = "-d";
            String i = "-i";
            String m = "m";
            String w = "w";
            int n = 0;
            try {
                switch (args[0]) {
                    case "-c": {
                        synchronized (allPeople) {
                            list.remove(0);
                            for (int j = 0; j < list.size(); j += 3) {
                                if (list.get(j + 1).equals(m)) {
                                    Date date = sdp.parse(list.get(j + 2));
                                    Person p = Person.createMale(list.get(j), date);
                                    allPeople.add(p);
                                    System.out.println(allPeople.indexOf(p));
                                } else if ((list.get(j + 1 + n).equals(w))) {
                                    Date date = sdp.parse(list.get(j + 2 + n));
                                    Person p = Person.createFemale(list.get(j + n), date);
                                    allPeople.add(p);
                                    System.out.println(allPeople.indexOf(p));
                                }
                            }
                            break;
                        }
                    }
                    case "-u": {
                        synchronized (allPeople) {
                            list.remove(0);
                            for (int j = 0; j < list.size(); j += 4) {
                                Person p = allPeople.get(Integer.parseInt(list.get(j)));
                                p.setName(list.get(j + 1));
                                if (list.get(j + 2).equals(m)) {
                                    p.setSex(Sex.MALE);
                                } else if (list.get(j + 2).equals(w)) {
                                    p.setSex(Sex.FEMALE);
                                }
                                Date date = sdp.parse(list.get(j + 3));
                                p.setBirthDay(date);
                            }
                            break;
                        }
                    }
                    case "-d": {
                        synchronized (allPeople) {
                            list.remove(0);
                            for (int j = 0; j < list.size(); j++) {
                                Person p = allPeople.get(Integer.parseInt(list.get(j)));
                                p.setBirthDay(null);
                                p.setName(null);
                                p.setSex(null);
                            }
                            break;
                        }
                    }
                    case "-i": {
                        synchronized (allPeople) {
                            list.remove(0);
                            for (int j = 0; j < list.size(); j++) {
                                Date dd = allPeople.get(Integer.parseInt(list.get(j))).getBirthDay();
                                String s = sdp2.format(dd);
                                Date date = sdp2.parse(s);
                                Person p = allPeople.get(Integer.parseInt(list.get(j)));
                                String sex = p.getSex().equals(Sex.MALE) ? "m" : "w";
                                System.out.println(p.getName() + " " + sex + " " + s);
                            }
                            break;
                        }
                    }
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}