package itProger; //пакет



public class Object {
    public static void main(String[] args) {

        // Person pes1 = new Person();
        // Person pes2 = new Person();
        // Person pes3 = new Person();
        // Person pes4 = new Person();
        //pes4.getCount(); //вызываем метод он посчитает на сколько раз каунт увеличился, т.к. мы создали 4 объекта 
        Person.getCount();//из класса вызываем статичный метод
        // Person.count = 5;
        // System.out.println(Person.count);
        Car bmw1 = new Car();
        bmw1.setLight(true);
        bmw1.blinkLight();
    //создали объект бмв на основе класса кар и передали значения в конструктор
        Car bmw = new Car(250.5f, 2500, "White", new byte[] {0,0,0});
        bmw.engine.setValues(true, 1000);
        bmw.engine.info(); //обращаемся к объекту бмв, потом к объекту инжин и через него вызываем функции которые записаны в классе инжин

    //создали объект грузовик на основе класса грузовик и передали значения в конструктор
        Truck truck = new Truck(5600, new byte[] {100,0,100});
        truck.engine.setValues(false, 100);
        truck.engine.info();
        // truck.setLoaded(false);
        // truck.getLoaded();
        // truck.setValues(250.5f, 2500, "White", new byte[] {0,0,0}, true);
        // System.out.println(truck.getValues());

        //Анонимные классы - это классы, что не имеют имени и их создание происходит в момент инициализации объекта. 
        Car flyCar = new Car(250.5f, 2500, "White", new byte[] {0,0,0}){ //анонимный объект
        @Override //переписали метод из абстрактного класса
        public void moveObject(float speed) {
            super.moveObject(speed);
            this.engine.isReady(true);
            System.out.println("Машина летит!");
            }
        };
        flyCar.moveObject(450);
    }
}