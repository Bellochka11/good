package GeekBrains.Lesson_2;

import java.util.Scanner;

// Задано уравнение вида x + y =z, (z, x, y >= 0.)
//  Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
//  Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
public class dz_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение вида 2? + ?5 = 69");
        String yravnenye = scanner.nextLine();
        String message = "Решения нет!";
        boolean flag = true;
        for (int i = 0; (i < 10) && flag; i++) {
            String result = yravnenye.replace("?", Integer.toString(i));//toString - инт в строку меняем ? на i
            System.out.println(result);
            String[] arr = result.split(" "); //разделяем стоку пробелами
            if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {//parseInt - строка в число
                message = result;
                flag = false;
            }
        }
        System.out.println(message);
        scanner.close();
    }
}
