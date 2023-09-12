package GeekBrains.Lesson_1;

// дан массив чисел [1,1,0,1,1,1] вывести максимальное кол-во подряд идущих 1
public class sem_1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                current++;
            } else {
                if (current > count) {
                    count = current;
                }
                current = 0;
            }
        }
        if (current > count) { //проверяем т.к. не встретили 0 в конце
            count = current;
        }
        System.out.println(count);
    }
}
