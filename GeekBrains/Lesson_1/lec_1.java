package GeekBrains.Lesson_1;

import java.util.Scanner;

public class lec_1 {
    public static void main(String[] args) { //метод main - точка входа
        // var i = 123; // var - неявная типизация. когда забыл тип данных пишем var
        String s = "qwer";
        System.out.println(s.charAt(0)); //выведет 0 символ - q
        //данные из терминала:
        // Scanner scanner = new Scanner(System.in); //открыли
        // System.out.println("Введите имя: ");
        // String name = scanner.nextLine(); //записали в нэйм данные с терминала .nextInt() - инт .nextDouble - дабл
        // System.out.println("Привет, " + name);
        // scanner.close(); //закрыли

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: "); //просим ввести инт
        boolean flag = iScanner.hasNextInt(); //установили проверку. во флаг мы кладём тру если ввели инт, если ввели не инт то фолс
        System.out.println(flag); 
        int y = iScanner.nextInt(); //вводит инт
        System.out.println(y); 
        iScanner.close();
        //тернарный оператор:
        int a = 1;
        int b = 2;
        int min = a < b ? a : b; //если а меньше б то кладём а, если нет, то кладём б
        System.out.println(min);
        //континью:
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; //пропускает итерацию. в нашем случае 2 4 6 т.к. их остаток от деления = 0
            }
            System.out.println(i);
        }
        //массивы:
        int[] arr2 = new int[] {1,2,3,4};
        System.out.println(arr2[1]);//2
        System.out.println(arr2.length);//4

        int[] arr3 = new int[] {1,2,3,4};
        for (int i : arr3) {
            System.out.println(i);
        }


        int[][] arr = new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                    System.out.printf("%d ", arr[i][j]);
                }
            System.out.println();
        }
        //преобразования: 
        int i = 123; double d = i; //из инт в дабл
        System.out.println(i); // 123 инт
        System.out.println(d); // 123.0 дабл
        d = 3.1415; i = (int)d; //из дабл в инт
        System.out.println(d); // 3.1415 дабл
        System.out.println(i); // 3 инт
        

    }
}
