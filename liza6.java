//Arrays.copyOf - копирует массив из одного в другой
//Arrays.sort - сортировка массива

import java.util.Arrays;
import java.util.Scanner;

public class liza6 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 45;
        nums[1] = 5;
        nums[2] = 4;
        nums[3] = 1;
        nums[4] = 6;
        int res = nums[3] + nums[4];
        System.out.println(res);

        float[] nums2 = new float[] {1.6f,2.7f,3.3f,4.2f,5.9f};
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }

        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите число: ");
            int num = scanner.nextInt(); //ввели числа с консоли
            arr[i] = num; //то что ввели засунули в массив
        }

        int min = arr[0]; //предположили что 0 элемент это минимум
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; //если нашли меньше предположенного то записываем его в мин
            }
        }
        System.out.println("Минимум: " + min);


        byte[][] arr2 = new byte[][]{ //двойной массив
            {9,6}, //9 - (0,0) 6 - (0,1) 3 - (1,0) 4 - (1,1) 5 - (2,0) 8 - (2,1)
            {3,4},
            {5,8},
        };
        System.out.println(arr2[1][1]); //выведет 4

        int[] arr6 = new int[] { 1, 2, 3, 5 };
        int[] some_new = Arrays.copyOf(arr6, arr6.length);// Arrays.copyOf скопировал массив из arr в some_new
        for (int i = 0; i < some_new.length; i++) {
            System.out.println(some_new[i]);
        }

        int[] numbers = new int[] { 1, 7, 3, 5, 2, 6, 4 };
        Arrays.sort(numbers); //отсортировал массив numbers по возрастанию
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
