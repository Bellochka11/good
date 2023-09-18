package GeekBrains.Lesson_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class readFile2 {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("file.txt");//создали файл
         Scanner scanner = new Scanner(f1);// подаем сканеру на поток ввода файл
         String line = scanner.nextLine();
         String[] arr = line.split(" "); //разделяем пробелом
         int[] numbers = new int[3];
         int count = 0;
         for (String number : arr) {
            numbers[count++] = Integer.parseInt(number);  //приводим к инту
         }
         System.out.println(Arrays.toString(numbers));
         
         scanner.close();
    }
}
