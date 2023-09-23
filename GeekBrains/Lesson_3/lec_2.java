package GeekBrains.Lesson_3;

import java.util.ArrayList;
// List – пронумерованный набор элементов.
// Пользователь этого интерфейса имеет точный контроль над тем, 
// где в списке вставляется каждый элемент.
// Пользователь может обращаться к элементам по их целочисленному 
// индексу (позиции в списке) и искать элементы в списке.
//ArrayList list1 = new ArrayList() -  сырой тип т.к. не написано тип данных
// add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
// get(pos) – возвращает элемент из списка по указанной позиции
// indexOf(item) – первое вхождение или -1
// lastIndexOf(item) – последнее вхождение или -1
// remove(pos) – удаление элемента на указанной позиции и его возвращение
// set(int pos, T item) – gjvtoftn значение item элементу, который находится
// на позиции pos
// void sort(Comparator) – сортирует набор данных по правилу
// subList(int start, int end) – получение набора данных от позиции start до end
// clear() – очистка списка
// toString() – «конвертация» списка в строку
// Arrays.asList – преобразует массив в список
// containsAll(col) – проверяет включение всех элементов из col
// removeAll(col) – удаляет элементы, имеющиеся в col
// retainAll(col) – оставляет элементы, имеющиеся в col
// toArray() – конвертация списка в массив Object’ов
// toArray(type array) – конвертация списка в массив type
// List.copyOf(col) – возвращает копию списка на основе имеющегося
// List.of(item1, item2,...) – возвращает неизменяемый список удалять элементы из него нельзя
//ArrayList - расширяемый, а массив - нет
public class lec_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);//10 эл, но можно добавить
        ArrayList<Integer> list4 = new ArrayList<>(list3);

    }
}
