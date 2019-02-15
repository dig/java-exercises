package dev.joseph;

import dev.joseph.list.LinkedList;

public class Main {

    public static void main(String[] args) {
        testLinkedList();
    }

    private static void testLinkedList() {
        LinkedList myList = new LinkedList();

        myList.add('a');
        myList.add('b');
        myList.add('c');

        System.out.println("Content: " + myList.toString());
        System.out.println("Size: " + myList.size());

        System.out.println("\nRemoving character 'a'");
        myList.delete('a');

        System.out.println("Content: " + myList.toString());
        System.out.println("Size: " + myList.size());

        System.out.println("\nRemoving index 1");
        myList.delete(1);

        System.out.println("Content: " + myList.toString());
        System.out.println("Size: " + myList.size());
    }

}
