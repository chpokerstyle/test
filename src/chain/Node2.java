package chain;

import java.util.Objects;

public class Node2 {
    private String value;
    private Node2 right;
    private Node2 left;

    public String getValue() {
        return value;
    }

    public Node2 getRight() {
        return right;
    }

    public void setRight(Node2 right) {
        this.right = right;
    }

    public Node2 getLeft() {
        return left;
    }

    public void setLeft(Node2 left) {
        this.left = left;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node2 node2 = (Node2) o;
        return Objects.equals(value, node2.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                '}';
    }
}
