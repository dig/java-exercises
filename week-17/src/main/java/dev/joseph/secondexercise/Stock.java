package dev.joseph.secondexercise;

import dev.joseph.firstexercise.Discount;
import dev.joseph.firstexercise.Item;
import lombok.Getter;

import java.util.ArrayList;

public class Stock {

    private ArrayList<Item> items;

    public Stock() {
        items = new ArrayList<Item>();
    }

    public void addItem(String name, double value){
        Item item = new Item(name, value);
        items.add(item);
    }

    public void addItem(String name, double value, Discount discount){
        Item item = new Item(name, value, discount);
        items.add(item);
    }

    public void applyDiscount(Discount discount) {
        for (Item item : items) {
            item.setDiscount(discount);
        }
    }

}
