package GeekBrains.Lesson_4;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();  //очередь кто первый зашел тот первый и вышел
        queue.add("Liza");
        queue.add("Maria");//добавляет в очередь
        queue.offer("Sahsa"); //добавляет в очередь
        System.out.println(queue);
        System.out.println(queue.remove()); //удалит 1
        System.out.println(queue);
    }
}
