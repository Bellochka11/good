public class liza10 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 8};
        int sum = summa(arr);
        System.out.println(sum);
    }
    public static int summa(int[] array){
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        return res;
    }
}
