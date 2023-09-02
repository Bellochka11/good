public class Object2 {
    public static void main(String[] args) {
        // Car bmw = new Car(250.7f, 2500, "red", new byte[] {0,0,0});//создали объект бмв из класса car
        // bmw.engine.setValues(false, 1000);
        // bmw.engine.info(); //вызвали метод info из класса engine

        // Truck truck = new Truck(5600, new byte[] {100,0,100});//truck - грузовик. создали объект грузовик из класса truck
        // truck.engine.setValues(true, 2000);
        // truck.engine.info();
        // truck.setLoaded(false);
        // truck.getLoaded();
        //truck.setValues(250.7f, 2500, "red", new byte[] {0,0,0}, true);
        //System.out.println(truck.getValues());
        Car flyCar = new Car(250.7f, 2500, "red", new byte[] {0,0,0}){ //анонимный класс
            @Override
            public void moveObject(float speed){
                super.moveObject(speed);
                this.engine.isReady(true);
                System.out.println("Машина летит! ");
            }

        };
        flyCar.moveObject(450);

    }
}
