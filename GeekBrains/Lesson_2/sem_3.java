package GeekBrains.Lesson_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//записать в файл слово TEST 10 РАЗ
public class sem_3 {
    public static void main(String[] args) {
        int n = 10;
        String str = "TEST";
        try {
            FileWriter writer = new FileWriter("file1.txt"); //создал файл file1.txt false - перезапись true - дозапись
            for (int i = 0; i < n; i++) {
                writer.write(str); //написали тест 10 раз
                writer.write("\n");
            }
            System.out.println("Получилось!");
            writer.close();//закрыли поток
        } catch (Exception e) {
            System.out.println("Что то пошло не так! ");
        }
        try {
            FileReader file = new FileReader("file1.txt");
            char[] arr = new char[20];
            file.read(arr);
            for (char c : arr) {
                System.out.print(c);
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Что то пошло не так! ");
        }
    }
}
