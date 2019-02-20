package dev.joseph;

import dev.joseph.firstexercise.Basket;
import dev.joseph.firstexercise.Discount;
import dev.joseph.secondexercise.Stock;
import dev.joseph.thirdexercise.Bursary;
import dev.joseph.thirdexercise.Student;
import dev.joseph.thirdexercise.University;

public class Main {

    public static void main(String[] args) {
        fourthExercise();
    }

    private static void firstExercise() {
        Basket myBasket = new Basket();

        //--- Add items into our basket.
        myBasket.addItem("Apples", .23);
        myBasket.addItem("Nuts", 1.23, Discount.EARLY);
        myBasket.addItem("Pineapples", .43);
        myBasket.addItem("Vodka", 10.99, Discount.MIDSEASON);

        //--- Print basket.
        System.out.println(myBasket.getNames());
    }

    private static void secondExercise() {
        Stock stock = new Stock();

        stock.addItem("Apples", .23);
        stock.addItem("Nuts", 1.23, Discount.EARLY);

        //--- Set all items to discount midseason.
        stock.applyDiscount(Discount.MIDSEASON);
    }

    private static void thirdExercise() {
        University university = new University();

        university.addStudent(new Student("Joseph", 18, Bursary.ACADEMIC));
        university.addStudent(new Student("Mike", 19, Bursary.NONE));
        university.addStudent(new Student("James", 20, Bursary.EMERGENCY));

        //--- Test replacing bursaries.
        System.out.println(university.toString());
        university.replace(Bursary.EMERGENCY, Bursary.NONE);
        System.out.println(university.toString());
        university.replace(Bursary.NONE, Bursary.ACADEMIC);
        System.out.println(university.toString());
    }

    private static void fourthExercise() {
        //--- Test bursaries list per student.
        Student student = new Student("Joseph", 18, Bursary.ACADEMIC);
        student.addBursary(Bursary.ACADEMIC);
        student.addBursary(Bursary.EMERGENCY);

        System.out.println(student.toString());
    }

}
