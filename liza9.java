//public - функция доступна всем внутри класса.
//Поскольку мы хотим обращаться к функциям напрямую без создания объекта, то мы прописываем ключевое слово static.
// Оно говорит компилятору что функция принадлежит всему классу, а не конкретным объектам.
public class liza9 {
    public static void main(String[] args) {
    //   info("Hello");
    //   String a = "Mimimi";
    //   info(a);
      summa(5, 10);
      int a = summa2(6, 5);
      info(String.valueOf(a)); //String.valueOf(a) - преобразовали из инт в стринг
      
    }

    public static void summa(Integer a, Integer b) { //принимает Integer a, Integer b, но ничего не возвращает
        int res = a + b;
        //System.out.println(res);
        String result = "Результат " + res;
        info(result);
    }
     public static int summa2(Integer a, Integer b) { //возвращает int, принимает Integer a, Integer b
        int res = a + b;
        //System.out.println(res);
        return res; //возвращает
    }

    public static void info(String word) { //функция выводит на экран
        System.out.print(word);
        System.out.println("!");
    }
}
