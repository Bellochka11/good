public class Car extends Transport2{ //Car наследует все от класса Transport2
    public Engine engine = new Engine(); //Engine - вложенный класс в транспорт

    public Car(float _speed, int _weight, String _color, byte[] _coordinate){ //конструктор к бмв
        super(_speed, _weight, _color, _coordinate); //super - значит что мы обращается к родительскому классу и вызывается оттуда функция
    }

    @Override //абстрактный метод
    public void moveObject(float speed) {
        System.out.println("Наш объект движется со скоростью: " + speed);
        
    }

    @Override//абстрактный метод
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }
    
}
