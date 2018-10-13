package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> kid = new ArrayList<>();
        ArrayList<Human> kids = new ArrayList<>();
        Human human0 = new Human("Сергей",true,5);
        Human human1 = new Human("Маша",false,5);
        Human human2 = new Human("Петя",true,3);
        kid.add(human0);
        kid.add(human1);
        kid.add(human2);
        Human human3 = new Human("Валя",false,34,kid);
        Human human4 = new Human("Олег",true,34,kid);
        ArrayList<Human> papa = new ArrayList<>();
        ArrayList<Human> mama = new ArrayList<>();
        mama.add(human3);
        papa.add(human4);
        Human human5 = new Human("Петр",true,66,mama);
        Human human6 = new Human("Катя",false,58,papa);
        Human human7 = new Human("Слава",true,61,papa);
        Human human8 = new Human("Карина",false,64,mama);
        System.out.println(human0);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();


        public Human (String name,boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            children = new ArrayList<>();
        }

        public Human (String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}