package dev.joseph.thirdexercise;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Student {

    @Getter
    private String name;

    @Getter
    private int age;

    @Getter @Setter
    private Bursary bursary;

    private ArrayList<Bursary> givenBursaries;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.bursary = Bursary.NONE;
        this.givenBursaries = new ArrayList<Bursary>();
    }

    public Student(String name, int age, Bursary bursary) {
        this(name, age);
        this.bursary = bursary;
    }

    public void addBursary(Bursary bursary) {
        this.givenBursaries.add(bursary);
    }

    public String toString() {
        String result = "";

        for (Bursary bursary : this.givenBursaries) {
            result += " " + bursary.toString();
        }

        return result;
    }

}
