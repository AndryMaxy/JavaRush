package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
    /*    Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();*/
        Hen hen1 = HenFactory.getHen(Country.RUSSIA);
        System.out.println(hen1.getDescription());

    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country == Country.BELARUS) {
                hen = new BelarusianHen();
            } else if (country == Country.MOLDOVA) {
                hen = new MoldovanHen();
            } else if (country == Country.RUSSIA) {
                hen = new RussianHen();
            } else if (country == Country.UKRAINE) {
                hen = new UkrainianHen();
            }

            return hen;
        }
    }
}

    abstract class Hen{
        abstract int getCountOfEggsPerMonth();

        String getDescription() {
            return "Я - курица.";
        }

    }
