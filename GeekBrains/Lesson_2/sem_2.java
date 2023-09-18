package GeekBrains.Lesson_2;

//напишите метод который сжимает строчку. вход: aaaabbbcdd
//выход: a4b3cd2
public class sem_2 {
    public static void main(String[] args) {
        String stroka = "aaaabbbcdd";
        String newStroka = StrComposer(stroka);
        System.out.println(newStroka);

    }

    public static String StrComposer(String str) {
        String stroka = ""; // новая строка
        char c = str.charAt(0); // символ под индексом
        Integer count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == c) { //сравниваем 1 индекс и 0
                count++;
            } else {
                stroka +="" + c + count; //прибавляем символ и его ко-во
                c = str.charAt(i);
                count = 1;
            }
        }
        return stroka + c + count;// чтобы в конце д вернулось
    }
}