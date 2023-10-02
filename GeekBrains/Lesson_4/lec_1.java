package GeekBrains.Lesson_4;

import java.util.PriorityQueue;

public class lec_1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pd = new PriorityQueue<>(); //наивысший приоритет за наименьшим элементом
        pd.add(132);
        pd.add(6);
        pd.add(3);
        pd.add(100);
        pd.add(66);
        System.out.println(pd);
    }
}
