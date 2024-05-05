package queue;

import java.util.Objects;

public class Node {

    public final Object value;

    private Node nodeLeft;

    private Node nodeRight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(value, node.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public Node(Object value) {
        this.value = value;
    }

    public void setNodeLeft(Node nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public void setNodeRight(Node nodeRight) {
        this.nodeRight = nodeRight;
    }

    public Object getValue() {
        return value;
    }

    public Node getNodeLeft() {
        return nodeLeft;
    }

    public Node getNodeRight() {
        return nodeRight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
