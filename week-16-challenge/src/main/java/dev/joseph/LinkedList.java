package dev.joseph;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LinkedList {

    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList() {
        this(null);
    }

    public void add(char character) {

        if (this.head == null) {
            this.head = new Node(character);
        } else {
            Node cur = this.head;

            while (cur.getNext() != null) {
                cur = cur.getNext();
            }

            cur.setNext(new Node(character));
        }

    }

    //--- Override toString method.
    public String toString() {
        Node next = this.head;
        String result = "";

        int count = 0;
        while (next != null) {
            result += count + ": " + next.getData() + (next.getNext() == null ? "" : ", ");

            next = next.getNext();
            count++;
        }

        return result;
    }

}
