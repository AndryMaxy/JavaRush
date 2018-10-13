package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double grade) {
        Student ss = null;
        for (Student s : students) {
            if (s.getAverageGrade() == grade) {
                ss = s;
                break;
            }
        }
        return ss;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        Student ss = null;
        double max = 0;
        for (Student s : students) {
            max = s.getAverageGrade() > max ? s.getAverageGrade() : max;
        }
        for (Student s : students) {
            if (s.getAverageGrade() == max) {
                ss = s;
                break;
            }
        }
        return ss;
    }

    public Student getStudentWithMinAverageGrade() {
        //TODO:
        Student ss = null;
        double min = students.get(0).getAverageGrade();
        for (Student s : students) {
            min = s.getAverageGrade() < min ? s.getAverageGrade() : min;
        }
        for (Student s : students) {
            if (s.getAverageGrade() == min) {
                ss = s;
                break;
            }
        }
        return ss;
    }

    public void expel(Student student) {
        students.remove(student);
    }


}