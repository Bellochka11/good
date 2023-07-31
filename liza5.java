// Оператор break - служит для выхода из цикла полностью;
// Оператор return - выполняет ту же функцию, что и оператор break, но  для циклов лучше использовать break;
// Оператор continue - пропускает лишь одну итерацию и не выходит из цикла.
public class liza5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;//пропускает одну итерацию цикла в нашем случае пропустил 3 6 и 9 т.к. остаток от деления = 0
            }
            System.out.println("Элемент " + i);
            System.out.println();
        }
        int x = 13;
        do { // Цикл do..while будет выполнен один раз, а дальше проверит условие и если оно верно, то цикл будет выполняться дальше
	        x--;
	        System.out.println(x);
        } while (x > 10);

        int a = 0;
        while (a <= 10) {
            System.out.println("Элемент " + a);
            a++;
        }
        //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
        int y = 10;
        int res;
        while (y<=20) {
            res = y*y;
            System.out.println(res);
            y++;
        }
    }
}
