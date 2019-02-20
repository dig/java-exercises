package dev.joseph.thirdexercise;

import lombok.Getter;

import java.util.ArrayList;

public class University {

    private ArrayList<Student> students;

    public University() {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void replace(Bursary from, Bursary to) {
        for (Student student : students) {
            if (student.getBursary() == from) {
                student.setBursary(to);
            }
        }
    }

    public String toString() {
        String result = "";

        for (Student student : students) {
            result += student.getName() + ", " + student.getAge() + ", " + student.getBursary().toString() + "\n";
        }

        return result;
    }

}
