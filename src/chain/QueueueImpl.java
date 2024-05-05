package chain;

public class QueueueImpl implements Queueue {

    private Node2 node2;

    /**
     * Добавление объекта в конец списка
     *
     * @param node2
     */
    @Override
    public void put(Node2 node2) {
        if (this.node2 == null) {
            this.node2 = node2;
        } else {
            while (node2.getLeft() == null) {
                if (this.node2.getRight() == null) {
                    node2.setLeft(this.node2);
                    this.node2.setRight(node2);

                }
                next();
            }
        }
    }

    @Override
    public synchronized Node2 peek(){
        if(node2.getLeft() != null){
            while (node2.getLeft() != null){
                node2 = node2.getLeft();
            }
            node2.getRight().setLeft(null);
            node2.setRight(null);
            return node2;
        }
        return node2;
    }

    /**
     * Перемещает курсор на следующий объект списка.
     * Итерация возможна если:
     *      1) Нода не пустая
     *      2) Нода имеет следующий ссылку на следующий объект (не является последним элементом в структуре)
     */
    @Override
    public void next() {
        // первый эл-нт
        if (node2 != null && node2.getLeft() == null && node2.getRight() != null) {
            this.node2 = node2.getRight();
        }
        // не последний эл-нт
        if (node2 != null && node2.getLeft() != null && node2.getRight() != null) {
            this.node2 = node2.getRight();
        }
//        var right = node2.getRight();
//        this.node2 = right;
    }

    @Override
    public synchronized void remove(Node2 node2) {

    }

    /**
     * Возвращает первый объект в списке
     *
     * @return
     */
    @Override
    public synchronized Node2 first(){
        if(node2.getLeft() != null){
            while (node2.getLeft() != null){
                node2 = node2.getLeft();
            }
            return node2;
        }
        return node2;
    }

    /**
     * Возвращает текущий элемент списка
     *
     * @return
     */
    @Override
    public synchronized Node2 now(){
        return node2;
    }

    private void inject(Node2 node2) {
        var left = this.node2;
        var right = node2;

        this.node2.setRight(right);
        node2.setLeft(left);
    }

    @Override
    public String toString() {
        return "QueueueImpl{" +
                "node=" + node2 +
                '}';
    }
}
