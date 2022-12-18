import java.util.Collections;
import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class lesson_4 {

    public static void main(String[] args) throws Exception {
        LinkedList<Integer> ll = new LinkedList<>();
        createList(ll);
        inverseList(ll);
    }

    private static void inverseList(LinkedList<Integer> ll) {
        Collections.reverse(ll);
        System.out.println(ll);
    }

    private static void createList(LinkedList<Integer> ll) {
        for (int index = 0; index < 10; index++) {
            ll.add(index);
        }
        System.out.println(ll);
    }

}
