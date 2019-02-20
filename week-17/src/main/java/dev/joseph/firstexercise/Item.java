package dev.joseph.firstexercise;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Item {

    private String name;
    private double value;
    private Discount discount;

    public Item() {};

    public Item(String name, double value) {
        this.name = name;
        this.value = value;
        this.discount = Discount.NONE;
    }

    public Item(String name, double value, Discount discount) {
        this(name, value);
        this.discount = discount;
    }

    public double getDiscountedValue() {
        return discount.getValue() * this.value;
    }


}
