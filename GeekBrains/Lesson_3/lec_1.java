package GeekBrains.Lesson_3;

public class lec_1 {
    public static void main(String[] args) {
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));
    }
//УПАКОВКА И РАСПАКОВКА – любой тип «ниже» Object’а ОН ПРИНИМАЕТ И ПРЕОБРАЗУЕТ ЛЮБЫЕ ТИПЫ
    static Object Sum(Object a, Object b) { //Object - самый главный тип данных
        if (a instanceof Double && b instanceof Double) { //если а и б дабл
            return (Object) ((Double) a + (Double) b); //складываем в дабл и переделываем в обджект
        } else if (a instanceof Integer && b instanceof Integer) { //если а и б инт
            return (Object) ((Integer) a + (Integer) b);//складываем в инт и переделываем в обджект
        } else
            return 0;
    }
}
