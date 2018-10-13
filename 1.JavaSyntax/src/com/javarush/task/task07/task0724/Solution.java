package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human human = new Human("Катя",false,16);
        Human human1 = new Human("Vasa",true,19);
        Human human3 = new Human("Катя2",false,15);
        Human human4 = new Human("Vasa2",true,19);
        Human human5 = new Human("Vasa2",true,19,human,human1);
        Human human6 = new Human("Vasa2",true,19,human,human1);
        Human human7 = new Human("Vasa2",true,19,human,human1);
        Human human8 = new Human("Vasa2",true,19,human,human1);
        Human human9 = new Human("Vasa2",true,19,human,human1);
        System.out.println(human);
        System.out.println(human1);
        System.out.println(human8);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human9);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age, Human mother, Human father) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















