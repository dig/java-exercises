package dev.joseph;

import lombok.Getter;

import java.util.ArrayList;

public class Basket {

    @Getter
    private ArrayList<Item> items;

    public Basket() {
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

    public String getNames() {
        String retVal = "";

        for (Item i : items) {
            retVal += i.getName();
        }

        return retVal;
    }

    public double getAverageDiscount() {
        double total = 0;

        for (Item item : items) {
            total += (1 - item.getDiscount().getValue());
        }

        total = total / (double) items.size();

        return total;
    }
    
}
