package GeekBrains.Lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//создать аррей лист добавить туда инт и стринг. удалить все интовые значения
public class sem_2 {
    public static void main(String[] args) {
        List<Object> array = new ArrayList<>(Arrays.asList("Земля", 3, 4, "Земля", 2, "Земля", "Земля"));
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) instanceof Integer) { //если элемент принаджелит типу инт
                array.remove(i);//удаляет
                i--; //т.к. где идет 2 подряд числа он смещается влево и перепрыгивает
            }
        }
            
       
    }
}
