package GeekBrains.Lesson_1;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//РАБОТА С ФАЙЛАМИ
public class lec_2 {
    public static void main(String[] args) {
        //СОЗДАНИЕ И ЗАПИСЬ/ДОЗАПИСЬ
        try (FileWriter fw = new FileWriter("file.txt", false)) { //создали файл file.txt КОНСТРУКТОР
        fw.write("line 1"); //НАПИСАЛИ
        fw.append('\n');
        fw.append('2'); //ДОБАВИЛИ 2
        fw.append('\n');
        fw.write("line 3"); //НАПИСАЛИ 3
        fw.flush(); //ЗАПИСЫВАЕМ
    } catch (IOException ex) { //ОШИБКИ
        System.out.println(ex.getMessage());
    }
    //Чтение, Вариант посимвольно
//     FileReader fr = new FileReader("file.txt");
//     int c;
//     while ((c = fr.read()) != -1) {
//         char ch = (char) c;
//         if (ch == '\n') {
//             System.out.print(ch);
//         } else {
//         System.out.print(ch);
//  }
//  }
// ЧТЕНИЕ Вариант построчно
    // public static void main(String[] args) throws Exception { //throws Exception - ЗНАЧИТ ЧТО ЧТЕНИЕ ФАЙЛА МОЖЕТ ЗАКОНЧИТСЯ ОШИБКОЙ
    //     BufferedReader br = new BufferedReader(new FileReader("file.txt"));
    //     String str;
    //     while ((str = br.readLine()) != null) {
    //         System.out.printf("== %s ==\n", str);
    //     }
    //     br.close();
    // }

 } }

