package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {

    public static ArrayList<Cat> cats = new ArrayList<>();
    //напишите тут ваш код

    public Cat() {
       //   Cat.cats = cats;
      //  cats.add(this);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
 /*       //напишите тут ваш код
        Cat cat1 = new Cat(cats);
        Cat cat2 = new Cat(cats);
      //  cats.add(cat2);
        Cat cat3 = new Cat(cats);
      //  cats.add(cat3);
        Cat cat4 = new Cat(cats);
      //  cats.add(cat4);
        Cat cat5 = new Cat(cats);
     //   cats.add(cat5);
        Cat cat6 = new Cat(cats);
     //   cats.add(cat6);
        Cat cat7 = new Cat(cats);
     //   cats.add(cat7);
        Cat cat8 = new Cat(cats);
     //   cats.add(cat8);
        Cat cat9 = new Cat(cats);
      //  cats.add(cat9);
        Cat cat10 = new Cat(cats);
      //  cats.add(cat10);*/
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (Object j : cats)
        System.out.println(j);

    }
}
