import queue;

public class start_queue {

    // Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() -
    // помещает элемент в конец очереди, dequeue() - возвращает первый элемент из
    // очереди и удаляет его, first() - возвращает первый элемент из очереди, не
    // удаляя.

    public static void main(String[] args) throws Exception {
        queue<Integer> queue = new queue<>(10);
        for (int index = 0; index < 5; index++) {
            queue.enqueue(index);
        }
        System.out.println("Текущая очередь начинается с - " + queue.first());
        System.out.println("Выводим и удаляем первый элемент - " + queue.dequeue());
        System.out.println("Теперь очередь начинается с - " + queue.first());
    }

}
