import java.util.LinkedList;

public class queue<E> {
    private LinkedList<E> massive;

    public queue(int i) {
        massive = (LinkedList<E>) new LinkedList<>(); // ?
    }

    // помещает элемент в конец очереди
    public LinkedList<E> enqueue(E item) {
        massive.addLast(item);
        return massive;
    }

    // возвращает первый элемент из очереди и удаляет его
    public E dequeue() {
        E element = massive.get(0);
        massive.remove(0);
        return element;
    }

    // возвращает первый элемент из очереди, не удаляя
    public E first() {
        E element = massive.get(0);
        return element;
    }

    // Возвращает размер
    public Integer size() {
        int count = 0;
        for (E item : massive) {
            if (item != null) {
                count++;
            }

        }
        return count;
    }

}
