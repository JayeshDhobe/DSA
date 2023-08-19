package Queue;

import java.util.*;

public class Dequeu {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(2);

        deque.addLast(1);

        deque.removeFirst();

        deque.removeLast();

        deque.getLast();

        deque.getFirst();

    }
}
