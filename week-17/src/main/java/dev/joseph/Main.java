package dev.joseph;

public class Main {

    public static void main(String[] args) {
        firstExercise();
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

}
