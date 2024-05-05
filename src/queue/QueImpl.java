package queue;

public class QueImpl implements Que {

    private volatile Node node;

    @Override
    public void put(Node node) {
        if (this.node == null) {
            this.node = node;
        } else {
            while (node.getNodeLeft() == null) {
                if (this.node.getNodeRight() == null) {
                    node.setNodeLeft(this.node);
                    this.node.setNodeRight(node);
                }
                next();
            }
        }
    }

    @Override
    public Object pick() {
        if (node.getNodeLeft() != null) {
            while (node.getNodeLeft() != null) {
                node = node.getNodeLeft();
            }
            var firstNode = node;
            var secondNode = node.getNodeRight();

            next();

            firstNode.setNodeRight(null);
            secondNode.setNodeLeft(null);

            return firstNode;
        }
        var lastNode = node;
        node = null;

        return lastNode;
    }

    /**
     * Перемещает курсор на следующий объект списка.
     * Итерация возможна если:
     * 1) Нода не пустая
     * 2) Нода имеет следующий ссылку на следующий объект (не является последним элементом в структуре)
     */
    private void next() {
        // первый эл-нт
        if (node != null && node.getNodeLeft() == null && node.getNodeRight() != null) {
            this.node = node.getNodeRight();
        }
        // не последний эл-нт
        if (node != null && node.getNodeLeft() != null && node.getNodeRight() != null) {
            this.node = node.getNodeRight();
        }
    }


}
