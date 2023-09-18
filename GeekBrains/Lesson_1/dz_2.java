package GeekBrains.Lesson_1;
// Вывести все простые числа от 1 до 1000
// Простые числа — это натуральные числа больше 1, у которых есть всего два делителя: единица и само число1. Список простых чисел123:
// 2 — первое и единственное четное простое число
public class dz_2 {
    public static void main(String[] args) {
        int num2 = 1000;
        for (int i = 3; i < num2; i++) {
            if ( i % i == 0 && i % 1 == 0) {
                System.out.println(i);
            }
        }
    }
}
