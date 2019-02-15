package dev.joseph.list;

import lombok.Getter;
import lombok.Setter;

/*
 * @author Joseph.
 */

public class Node {

    @Getter
    private char data;
    @Getter @Setter
    private Node next;

    public Node(char character, Node next) {
        this.data = character;
        this.next = null;
    }

    public Node(char character) {
        this(character, null);
    }

}
