package GeekBrains.Lesson_5;

import java.util.HashMap;
import java.util.Map;
//map <- hashMap, hashTable
// hashMap <- linkedHashMap
//map - пары ключ значение

//hashMap - пары ключ значение, не запоминает порядок добавления элементов и работает очень быстро
//ключ - уникальный, может быть null. если добавляем другое значение с тем же ключом, то оно перезаписывается
//значения элементов могут повторяться, а также быть null
public class hashMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>(); //создали hashMap ключ - инт, значение - стринг
        map1.put(1000, "Liza Bel"); //put - добавляем значения в map 
        map1.put(2000, "Lena Bel");
        map1.put(3000, "Nastya Rar");
        map1.put(4000, "George Merge");
        map1.putIfAbsent(1000, "Begom");//putIfAbsent-добавь такой элемент если его нету. Не добавит, т.к. есть уже такой ключ
        System.out.println(map1);
        System.out.println(map1.get(2000));//get- выводит значение по ключу 2000. если такого ключа нету то выведет null
        map1.remove(4000); //remove - удаляет значение по ключу
        System.out.println(map1);
        System.out.println(map1.containsValue("Nastya Rar"));//containsValue - выведет true если это значение есть. по ЗНАЧЕНИЮ
        System.out.println(map1.containsKey(1000));//containsKey - ищет по ключам, true 
        System.out.println(map1.keySet());//keySet - выведет все ключи которые есть
        System.out.println(map1.values());//values- выведет все значения которые есть

        Map<String, String> map2 = new HashMap<>(); //ключ и значение могут быть одинаковыми и разными
        map2.put("Sasha", "Dobriy");
        map2.put("Musha", "Umniy");
        System.out.println(map2);
    }
}
