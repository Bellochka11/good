public class Object2 {
    public static void main(String[] args) {
        Car bmw = new Car(250.7f, 2500, "red", new byte[] {0,0,0});//создали объект бмв из класса car

        Truck truck = new Truck(5600, new byte[] {100,0,100});//truck - грузовик. создали объект грузовик из класса truck
        truck.setLoaded(false);
        truck.getLoaded();


    }
}
