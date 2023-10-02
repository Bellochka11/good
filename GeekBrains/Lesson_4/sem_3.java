package GeekBrains.Lesson_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

//написать массив который поместит в очередь и выведет на экран
public class sem_3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arc1 = new int[10];
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            arc1[i]  = val;
        }
        System.out.println(inArray(arc1));
    }
    public static Queue<Integer> inArray(int[] array){
        Queue<Integer> result = new LinkedList<>();
            for(int i : array){
                result.add(i);
            }
        return result;
    }
}
