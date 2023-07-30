// КАЛЬКУЛЯТОР
import java.util.Scanner;

public class liza4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите 2 число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите действие: ");
        String n = scanner.nextLine(); //БЕРЕТ СКРЫТЫЙ СИМВОЛ ЗДЕСЬ НЕВИДИМЫЙ СКРЫТЫЙ СИМВОЛ
        n = scanner.nextLine();//ТАК НАДО НАПИСАТЬ ТУТ УЖЕ БЕРЕТ НОРМАЛЬНОЕ ЗНАЧЕНИЕ
        int res;
        switch (n) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
                case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
                case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
                case "/":
                if (num2 == 0) {
                    System.out.println("Делить на 0 нельзя!");
                    break;
                }
                else {
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                    break;
                }
                default:
                System.out.println("Вы ввели что то не так!");
                break;
        }
    }
}
