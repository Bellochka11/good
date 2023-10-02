package GeekBrains.Lesson_4;

import java.util.Stack;

public class stack {
    public static void main(String[] args) { //те данные которые пришли первые будут обрабатываться в последнюю очередь
        Stack<String> st = new Stack<>();
        st.push("Anna");
        st.push("Lena");
        st.push("Liza");
        System.out.println(st);
        //st.pop();//удалит Liza т.к. находится на последней позиции
        while (!st.isEmpty()) { //пока стек не пуст
            st.pop(); //.pop() - удаляет 
            System.out.println(st);
        }
       

    }
}
