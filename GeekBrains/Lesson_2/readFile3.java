package GeekBrains.Lesson_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile3 {
    public static void main(String[] args) {
        File f1 = new File("file.txt");//создали файл
         try {
            Scanner scanner = new Scanner(f1);// подаем сканеру на поток ввода файл
            System.out.println("после сканера если вышла ошибка код дальше не выполняется, а если нет - выполняется");
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }
        System.out.println("после блока try catch");
    }
}
