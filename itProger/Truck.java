package itProger;
//public class Truck extends Transport {} - класс Truck наследует все от класса Transport
public class Truck extends Transport {
    private boolean isLoaded; //isLoaded - загружен ли грузовик

    //1)СОЗДАЛИ КОНСТРУКТОР ДЛЯ ГРУЗОВИКА. 2 ПАРАМЕТРА
     public Truck(int weight, byte[] coordinate) { 
        // В класс родитель мы передаем 2 параметра и из класса родителя будет выполняться конструктор с 2 параметрами
        super(weight, coordinate);//super() -  это как this, только обращение к классу родителю
    }
    //2)СОЗДАЛИ КОНСТРУКТОР ДЛЯ ГРУЗОВИКА. 3 ПАРАМЕТРА
     public Truck(int weight, byte[] coordinate, boolean isLoaded) { 
        // В класс родитель мы передаем 2 параметра и из класса родителя будет выполняться конструктор с 2 параметрами
        super(weight, coordinate);//super() -  это как this, только обращение к классу родителю
        this.isLoaded = isLoaded;
    }

    public void setLoaded(boolean loaded){ //присваивает значение 
        this.isLoaded = loaded;
    }
    public void getLoaded(){
        if (isLoaded) {
            System.out.println("Грузовик загружен!");        
        }
        else {
            System.out.println("Грузовик не загружен!");
        }
    }
}
