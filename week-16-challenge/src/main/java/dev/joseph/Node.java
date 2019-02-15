package dev.joseph;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Node {

    private char data;
    private Node next;

    public Node(char character, Node next) {
        this.data = character;
        this.next = null;
    }

    public Node(char character) {
        this(character, null);
    }

}
