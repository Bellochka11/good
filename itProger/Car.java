package itProger;
//public class Car extends Transport {} - класс Car наследует все от класса Transport
public class Car extends Transport{
// СОЗДАЛИ КОНСТРУКТОР ДЛЯ БМВ - public Car() {} при создании объекта будет выполняться код в {} скобках! 4 ПАРАМЕТРА
     public Car(float speed, int weight, String color, byte[] coordinate) { 
        // В класс родитель мы передаем 4 параметра и из класса родителя будет выполняться конструктор с 4 параметрами
        super(speed, weight, color, coordinate);//super() -  это как this, только обращение к классу родителю
     }
     
    
}
