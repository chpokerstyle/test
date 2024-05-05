package queue;

public class QueMain {
    public static void main(String[] args) {
        Que que = new QueImpl();
        Node node = new Node("первый");
        que.put(node);

        var node2 = new Node("второй");
        que.put(node2);

        var node3 = new Node("третий");
        que.put(node3);

        System.out.println(que.pick());
        System.out.println(que.pick());
        System.out.println(que.pick());

        System.out.println(que.pick());
    }
}
