package GeekBrains.Lesson_1;

import java.util.Arrays;

//Дан массив array = [3,2,4,3,3,1,5,3,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
// [2 4 1 5 3 3 3 3 3]
// Работать разрешается только с 1 массивом.
public class sem_2 {
    public static void main(String[] args) {
        int[] array = { 3, 2, 4, 3, 3, 1, 5, 3, 3 };
        int value = 3;
        int swp = 0;
        // int counter = 0;
        // for (int i = 0; i < array.length; i++) {
        //     if (array[i] == 3) {
        //         counter += 1;
        //     }
        // }
        // for (int i = 0; i < array.length - counter; i++) {
        //     if (array[i] == value) {
        //         for (int j = i; j < array.length - 1; j++) {// смещение элементов влево
        //             array[j] = array[j + 1]; // перемещение влево
        //         }
        //         array[array.length - 1] = value; // последний элемент = 3
        //         i--;
        //     }
        // }
        for (int i = 1; i < array.length; i++) { //пузырек
            for (int j = i; j < array.length; j++) {
                if (array[j - 1] == 3) {
                    swp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = swp;

                }
            }

            System.out.println(Arrays.toString(array));

        }
        // System.out.println(Arrays.toString(array));
        
    }
}
