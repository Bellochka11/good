package GeekBrains.Lesson_1;

import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class dz_1 {
    
    public static void main(String[] args) {
        int sum1 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введие треугольное число: ");
        int n = scanner.nextInt();
        System.out.print("Введие факториал числа: ");
        int b = scanner.nextInt();
        while (n !=0) {
            sum1 += n;
            n--;
        }
       
        int sum2 = fact(b);

        System.out.println("Факториал числа равен: " + sum2);

        System.out.println("Треугольное число равно: " + sum1);

    }
    public static int fact(int b){
        if (b == 1) {
            return 1;
        }
        return b * fact(b - 1);
    }
}
