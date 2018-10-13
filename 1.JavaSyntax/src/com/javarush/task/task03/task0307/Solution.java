package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "lalka";

        Zerg zerg2 = new Zerg();
        zerg2.name = "ll";

        Zerg zerg3 = new Zerg();
        zerg3.name = "aa";

        Zerg zerg4 = new Zerg();
        zerg4.name = "af";

        Zerg zerg5 = new Zerg();
        zerg5.name = "ad";

        Protoss protoss = new Protoss();
        protoss.name = "hh";

        Protoss protoss2 = new Protoss();
        protoss2.name = "hhfg";

        Protoss protoss3 = new Protoss();
        protoss3.name = "hhgf";

        Terran terran1 = new Terran();
        terran1.name = "hfdag";

        Terran terran2 = new Terran();
        terran2.name = "hfdafg";

        Terran terran3 = new Terran();
        terran3.name = "hfsdfdag";

        Terran terran4 = new Terran();
        terran4.name = "hfdasaaag";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
