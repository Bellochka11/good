package itProger;

public class Object {
    public static void main(String[] args) {

    //создали объект бмв на основе класса кар и передали значения в конструктор
        Car bmw = new Car(250.5f, 2500, "White", new byte[] {0,0,0});

    //создали объект грузовик на основе класса грузовик и передали значения в конструктор
        Truck truck = new Truck(5600, new byte[] {100,0,100});
        truck.setLoaded(false);
        truck.getLoaded();
        
    }
}