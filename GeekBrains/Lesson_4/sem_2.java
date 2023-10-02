package GeekBrains.Lesson_4;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

//принимает от пользователя и запоминает строки если введено print выводит строки так чтобы последняя была первой а первая последней
//и чистит весь перечень
//[qwe, rty, zxc]
//print
//zxc, rty, qwe []
public class sem_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        Stack<String> list1 = new Stack<String>();
        while (!stroka.equals("exit")) { // пока строка не равна exit терминал будет просить ввод
            if (stroka.equals("print")) { // если строка содержит print~
                while (!list1.empty()) { //не пустой
                    System.out.println(list1.pop());//.pop - удаляет и возвращает
                }
            } else {
                list1.push(stroka); // добавляем строку
            }
            System.out.println(list1); // выводим
            stroka = in.nextLine(); // ввод
        }
    }
}
