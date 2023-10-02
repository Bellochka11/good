package GeekBrains.Lesson_4;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(); //можно добавлять элементы как в начало так и в конец
            deque.addFirst(1);
            deque.addLast(6);
            System.out.println(deque);
        };
    }

