package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
       // printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        for (int i = 0; i < 4; i++) {
            Cat cat = new Cat();
            result.add(cat);
        }
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> result = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            Dog dog = new Dog();
            result.add(dog);
        }
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.addAll(cats);
        hashSet.addAll(dogs);
        return hashSet;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
/*        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            Iterator<Cat> iterator2 = cats.iterator();
            while (iterator2.hasNext()) {
                Cat cat = iterator2.next();
                if (o.equals(cat))
                    iterator.remove();
            }
        }*/
     //   pets.removeAll(cats);
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof Cat) iterator.remove();
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object o : pets) {
            System.out.println(o);
        }
    }

    public static class Cat{

    }

    public static class Dog{

    }
    //напишите тут ваш код
}
