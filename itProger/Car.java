package itProger;//пакет
//public class Car extends Transport {} - класс Car наследует все от класса Transport
public class Car extends Transport implements ILights{
//создали объект двигатель на основе класса двигатель
    public Engine engine = new Engine();

    private boolean isOn;

// СОЗДАЛИ КОНСТРУКТОР ДЛЯ БМВ - public Car() {} при создании объекта будет выполняться код в {} скобках! 4 ПАРАМЕТРА
     public Car(float speed, int weight, String color, byte[] coordinate) { 
        // В класс родитель мы передаем 4 параметра и из класса родителя будет выполняться конструктор с 4 параметрами
        super(speed, weight, color, coordinate);//super() -  это как this, только обращение к классу родителю
     }

     public Car(){}

    @Override //переписали метод из абстрактного класса
    public void moveObject(float speed) {
        System.out.println("Наш объект движется со скоростью" + speed);
        
    }

    @Override//переписали метод из абстрактного класса
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

    @Override //метод из интерфейса
    public void blinkLight() {
        System.out.println("Мы моргаем фарами");
        
    }

    @Override//метод из интерфейса
    public void setLight(boolean set) {
        this.isOn = set;
        
    }

    
    
     
    
}
