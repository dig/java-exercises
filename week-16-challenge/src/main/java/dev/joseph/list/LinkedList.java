package dev.joseph.list;

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

    public void delete(char character) {
        Node cur = this.head, prev = null;

        while (cur != null) {
            if (cur.getData() == character) {
                if (prev == null) {
                    this.head = cur.getNext();
                } else {
                    prev.setNext(cur.getNext());
                }
            }

            prev = cur;
            cur = cur.getNext();
        }
    }

    public void delete(int index) {
        Node cur = this.head, prev = null;
        int count = 0;

        while (cur != null) {
            if (count == index) {
                if (prev == null) {
                    this.head = cur.getNext();
                } else {
                    prev.setNext(cur.getNext());
                }
            }

            prev = cur;
            cur = cur.getNext();
            count++;
        }
    }

    public int size() {
        Node cur = this.head;
        int count = 0;

        while (cur != null) {
            cur = cur.getNext();
            count++;
        }

        return count;
    }

    public boolean contains(char character) {
        return false;
    }

    //--- Override toString method.
    public String toString() {
        Node cur = this.head;
        String result = "";

        int count = 0;
        while (cur != null) {
            result += count + ": " + cur.getData() + (cur.getNext() == null ? "" : ", ");

            cur = cur.getNext();
            count++;
        }

        return result;
    }

}
