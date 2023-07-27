// nextLine () - для ввода строки. Возвращаемый тип данных String;
// nextInt () - для ввода целых чисел. Возвращаемый тип данных int;
// nextFloat () - для ввода чисел с плавающей точкой. Возвращаемый тип данных float;
// nextDouble () - для ввода больших чисел с плавающей точкой. Возвращаемый тип double.
// / - деление значения после точки не показывает если используем int, если float то показывает
// % остаток от деления
//Экземпляр – это объект класса, который наследует все методы и переменные класса.
import java.util.Scanner; //импортировали сканер

public class liza3 {
    public static void main(String[] args) {
        Scanner some_name = new Scanner(System.in); // Создаем объект с именем some_name. System.in - значит что мы будем получать данные от пользователя
        // System.out.print("Введите имя: ");
        // String name = some_name.nextLine(); //nextLine() - для ввода строки. тип данных String; присвоили переменной name то что ввел пользователь
        // System.out.println("Привет, " + name);
        int a = some_name.nextInt(); //nextInt () - для ввода целых чисел. присвоили переменной a то что ввел пользователь
        System.out.println(a);
        short num1 = 50, num2 = 10;
        int res = num1 + num2;
        System.out.println(res);
    }

}
