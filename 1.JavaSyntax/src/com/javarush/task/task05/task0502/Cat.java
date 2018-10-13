package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {


    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int c1 = this.strength + this.weight - this.age;
        int c2 = anotherCat.strength + anotherCat.weight - anotherCat.age;
/*        if  (this.strength > anotherCat.strength && this.weight >= anotherCat.weight || anotherCat.weight <= this.weight && this.age <= anotherCat.age || anotherCat.age >= this.age)
            return true;
        else return false;*/
        if (c1 > c2)
            return true;
        else return false;
    }

        public static void main (String[]args){
            Cat cat1 = new Cat();
            Cat cat2 = new Cat();
            cat1.strength = 12;
            cat1.age = 4;
            cat1.weight = 4;
            cat2.weight = 5;
            cat2.age = 6;
            cat2.strength = 10;
            if (cat1.fight(cat2))
                System.out.println(1);
            else System.out.println(2);
            if (cat2.fight(cat1))
                System.out.println(3);
            else System.out.println(4);
        }
    }