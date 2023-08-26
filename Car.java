public class Car extends Transport2{ //Car наследует все от класса Transport2
    public Car(float _speed, int _weight, String _color, byte[] _coordinate){ //конструктор к бмв
        super(_speed, _weight, _color, _coordinate); //super - значит что мы обращается к родительскому классу и вызывается оттуда функция
    }
    
}
