package dev.joseph;

import lombok.Getter;
import lombok.Setter;

public class Node {

    @Getter
    private char data;

    @Getter @Setter
    private Node next;

    public Node(char character, Node next) {
        this.data = character;
        this.next = null;
    }

}
