package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {

    int getCountOfEggsPerMonth() {
        return 7;
    }

    String getDescription() {

        return super.getDescription() + " Моя страна - " + Country.BELARUS + "." + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
