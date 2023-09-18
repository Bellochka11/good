package GeekBrains.Lesson_1;

import java.util.Scanner;

public class dz_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите 2 число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите действие: ");
        String n = scanner.nextLine();
        String n1 = scanner.nextLine();
        int sum = 0;
        switch (n1) {
            case "+":
                sum = num1 + num2;
                System.out.println("Результат: " + sum);
                break;
            case "-":
                sum = num1 - num2;
                System.out.println("Результат: " + sum);
                break;
            case "*":
                sum = num1 * num2;
                System.out.println("Результат: " + sum);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("На ноль делить нельзя!");
                }
                sum = num1 / num2;
                System.out.println("Результат: " + sum);
                break;
        
            default:
            System.out.println("Вы ничего не ввели!");
                break;
        }

    }
}
