package GeekBrains.Lesson_4;
//принимает строку text
//сохраняем text в список если введено print~num выводи мстроку из позиции num в списке и удаляем ее из списка
//[qwe, rty, zxc]
//print~1
//rty [qwe,zxc]
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

//ArrayList - индекс, LinkedList - индекса нет каждый элемент хранит в себе значение и ссылку на последующий объект
public class sem_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        LinkedList<String> list1 = new LinkedList<String>();
        while (!stroka.equals("exit")) { //пока  строка не равна exit терминал будет просить ввод
            if (stroka.startsWith("print~")) { //если строка содержит print~
                //Integer number = Integer.parseInt(stroka.split("~")[1]);
                list1.remove(Integer.parseInt(stroka.split("~")[1])); //удаляем сплитовую строку print[0] 1[1] - 1 индекса
            }
            else {
                list1.add(stroka); //добавляем строку
            }
            System.out.println(list1); //выводим
            stroka = in.nextLine(); //ввод
        }
    }
}
