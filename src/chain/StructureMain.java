package chain;

public class StructureMain {
    public static void main(String[] args) {
        Queueue que = new QueueueImpl();
        var node = new Node2();
        node.setValue("первый");
        que.put(node);

        var node2 = new Node2();
        node2.setValue("второй");
        que.put(node2);

        var node3 = new Node2();
        node3.setValue("третий");
        que.put(node3);


        System.out.println(que.first());
        que.next();
        System.out.println(que.now());

        System.out.println("-----------------------------------------------------------------------");


        System.out.println(que.peek());
        System.out.println(que.peek());
        System.out.println(que.peek());

    }
}
