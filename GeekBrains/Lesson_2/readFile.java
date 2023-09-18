package GeekBrains.Lesson_2;
//СЧИТЫВАНИЕ ТЕКСТА ИЗ ФАЙЛА file.txt на рабочем столе
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) throws FileNotFoundException { //FileNotFoundException выводится в случае ошибки ненаход файла
        //String separator = File.separator;//separator -  ставит разделители для каждой операц.системы
        String path = "C:\\Users\\BOSS\\Desktop\\file.txt"; //путь до файла
        File file = new File(path); //создали файл и передали туда путь
        Scanner scanner = new Scanner(file);// подаем сканеру на поток ввода file
        while (scanner.hasNextLine()) {//hasNextLine() - считывает строки из файла. тру если есть строки, фолс - если закончились
            System.out.println(scanner.nextLine());//выводим на экран строки
        }
        scanner.close();
    }
}
