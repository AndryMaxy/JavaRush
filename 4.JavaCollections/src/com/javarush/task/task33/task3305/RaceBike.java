package com.javarush.task.task33.task3305;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "className")
@JsonSubTypes(@JsonSubTypes.Type(value = RaceBike.class, name = "com.javarush.task.task33.task3305.RaceBike"))
public class RaceBike extends Motorbike {
    private String owner;
    private int age;

    public RaceBike(String name, String owner, int age) {
        super(name);
        this.owner = owner;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "RaceBike{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", age=" + age +
                '}';
    }
}