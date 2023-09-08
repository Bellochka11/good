package itProger;

public class Person {
    private static int count;
    public Person(){ //конструктор при создании объекта тут выполняется код
        count++;
    }
    public static void getCount(){
        System.out.println(count);
    }
}
