package GeekBrains.Lesson_2;

import java.io.IOException;
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) { //цикл будет длиться до тех пор, пока вводим 0, если не 0 то цикл закончится
        Integer x = Integer.parseInt(scanner.nextLine()); //вводим строки и преобразуем их в инт
        if (x != 0) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Пользователь ввел что то кроме 0!"); //выбросится ошибка
            }            
        }           
        }
    }
}
