package GeekBrains.Lesson_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//заполнить список планет в произвольном порядке. вывести название планеты и кол-во его повторений в списке
//[земля земля марс юпитер земля]
//земля 3 марс 1 юпитер 1
public class seem_1 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Земля", "Земля", "Марс", "Юпитер", "Плутон"));
        System.out.println(list1);
        int count = 1;
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < list1.size() - 1; i++) { // -1 т.к. размер 6, а тут нумерация с 0
            if (!list2.contains(list1.get(i))) {
                list2.add(list1.get(i)); //в новый список добавляем те планеты с которыми уже поработали
                count = 1;
                for (int j = i + 1; j < list1.size() - 1; j++) {
                    if (list1.get(i) == list1.get(j)) {
                        count++;
                    }
                }
                System.out.println(list1.get(i) + count);
            }

        }
    }
}