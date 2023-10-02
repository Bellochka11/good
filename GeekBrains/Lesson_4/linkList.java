package GeekBrains.Lesson_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class linkList {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list1.remove(list1.get(3));
        System.out.println(list1);
    }
}
