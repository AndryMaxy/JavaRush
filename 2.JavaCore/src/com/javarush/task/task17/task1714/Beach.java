package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
 /*       Integer t = 5;
        int q = 2;
        t.compareTo(q);*/
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public synchronized int compareTo(Beach o) {
        float f1 = distance;
        float f2 = o.getDistance();
        int q1 = quality;
        int q2 = o.getQuality();
        float s1 = f1 - q1;
        float s2 = f2 - q2;
        float e = s1 - s2;
        return (int) e;
    }

    public static void main(String[] args) {

        Beach b1 = new Beach("1", 2, 6);
        Beach b2 = new Beach("2", 8, 4);
        System.out.println(b1.compareTo(b2));

    }
}
