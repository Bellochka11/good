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

 
    public void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded){ //setValues - установка значений
        super.setValues(speed, weight, color, coordinate);//передаем в родительский метод значения
        this.isLoaded = isLoaded;
    }

    //Аннотация, полиморфизм переписываем метод! вызвался метод из родительского класса + из класса трак грузовик загружен
    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded){ //присваивает значение 
        this.isLoaded = loaded;
    }
    public String getLoaded(){
        if (isLoaded) {
            return "Грузовик загружен!";        
        }
        else {
            return"Грузовик не загружен!";
        }
    }
}
