package dev.joseph;

public class Main {

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.add('a');
        myList.add('b');
        myList.add('c');

        System.out.println(myList.toString());

        myList.delete(1);

        System.out.println(myList.toString());
    }

}
