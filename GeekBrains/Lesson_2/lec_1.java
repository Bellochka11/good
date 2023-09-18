package GeekBrains.Lesson_2;
// concat(): объединение строк
// valueOf(): преобразует Object в строковое представление (завязан на toString())
// join(): объединяет набор строк в одну с учетом разделителя
// charAt(): получение символа по индексу
// indexOf(): первый индекс вхождения подстроки
// lastIndexOf(): последний индекс вхождения подстроки
// startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
// replace(): замена одной подстроки на другую
// trim(): удаляет начальные и конечные пробелы
// substring(): возвращает подстроку, см.аргументы
// toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
// сompareTo(): сравнивает две строки
// equals(): сравнивает строки с учетом регистра
// equalsIgnoreCase(): сравнивает строки без учета регистра
// regionMatches(): сравнивает подстроки в строках

import java.io.File;

public class lec_1 {
    public static void main(String[] args) {
        //cоздать строку из 1 млн плюсиков. Как?
        // StringBuilder sb = new StringBuilder(); //если строчку надо менять то это используем это как массив чаров (символов)
        // for (int i = 0; i < args.length; i++) {
        //     sb.append("+");
        // }
        //File f1 = new File("file.txt");
        String s1 = new String("Java");
        System.out.println(s1.concat(" Hot"));//выведет JavaHot
        System.out.println(s1);//выедет Java. т.е. строчка осталась такой же

        StringBuilder sb = new StringBuilder();
        sb.append("Java ");
        System.out.println(sb.append("Hot"));//выведет JavaHot
        System.out.println(sb);//выведет JavaHot, новая строчка




    }

}
