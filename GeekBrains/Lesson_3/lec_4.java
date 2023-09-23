package GeekBrains.Lesson_3;

import java.util.Iterator;
import java.util.List;
//  Iterator:
// hasNext(), next(), remove(), hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)
// ListIterator<E> 
public class lec_4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        for (int item : list) {
            System.out.println(item);
        }
        Iterator<Integer> col = list.iterator();//помогает вывести элементы идет по ссылкам на каждый элемент
        while (col.hasNext()) { //пока есть следующий элемент
            System.out.println(col.next()); //выводим этот элемент
        }
    }
}
