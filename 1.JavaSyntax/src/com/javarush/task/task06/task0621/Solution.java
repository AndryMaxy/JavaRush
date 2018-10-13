package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat grandpa = new Cat(grandpaName);

        String grandmaName = reader.readLine();
        Cat grandma = new Cat(grandmaName);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, grandpa, null);

        String motherName = reader.readLine();
        Cat mother = new Cat(motherName, null, grandma);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, father, mother);

        String dauName = reader.readLine();
        Cat daughter = new Cat(dauName, father, mother);

        System.out.println(grandpa);
        System.out.println(grandma);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat dad;
        private Cat mother;

        public Cat(String name) {
            this.name = name;
        }


        Cat(String name, Cat dad, Cat mother) {
            this.name = name;
            this.dad = dad;
            this.mother = mother;

        }

        @Override
        public String toString() {
            if (dad == null && mother == null)
                return "Cat name is " + name + ", no mother " + ", no father ";
            else if (mother == null && dad != null)
                return "Cat name is " + name + ", no mother " + ", father is " + dad.name;
            else if (mother != null && dad == null)
                return "Cat name is " + name + ", mother is "  + mother.name + ", no father ";
            else
                return "Cat name is " + name + ", mother is "  + mother.name + ", father is " + dad.name;
        }
    }

}
