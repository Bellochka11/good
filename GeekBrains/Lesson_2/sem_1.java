package GeekBrains.Lesson_2;
//дано четное число N (>0) И СИМВОЛЫ С1 И С2 НАПИСАТЬ МЕТОД КОТОРЫЙ ВЕРНЕТ СТРОКУ ДЛИНЫ N
// КОТОРАЯ СОСТОИТ ИЗ ЧЕРЕДУЮЩИХСЯ С1 И С2. НАЧИНАЯ C C1

// String stroka = "qwerty";
// StringBuilder sb = new StringBuilder(stroka);//это как массив чаров (символов)
// sb.append("asd").append("fgh");
// System.out.println(sb.toString()); //toString()- привели обратно к строке
public class sem_1 {
    public static void main(String[] args) {
        StringBuilder stroka = new StringBuilder();
        int N = 10;
        Character c1 = 'q';
        Character c2 = 'w';
        System.out.println(met(N, c1, c2, stroka));

    }
    public static String met(int N, Character c1, Character c2, StringBuilder stroka){
        for (int i = 0; i < N/2; i++) { //делим на 2 чтобы сделать цикл 3 раза т.к. добавляем сразу 2 символа
            stroka.append(c1).append(c2);
        }
        return stroka.toString(); //toString()- привели обратно к строке
    }
}
