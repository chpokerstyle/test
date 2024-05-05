package queue;

public interface Que <T> {

    void put(Node node);

    Object pick();
}
