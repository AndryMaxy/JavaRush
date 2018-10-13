package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, Person> map = new HashMap<>();
        map.put("user", new Person.User());
        map.put("loser", new Person.Loser());
        map.put("coder", new Person.Coder());
        map.put("proger", new Person.Proger());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = "";

        while (map.containsKey(key = reader.readLine())) {
            doWork(map.get(key));
        }


    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        } else if ((person instanceof Person.Coder)) {
            ((Person.Coder) person).coding();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        }
    }
}
