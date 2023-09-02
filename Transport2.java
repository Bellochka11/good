public abstract class Transport2 {// abstract - абстрактный класс
    protected float speed; //speed - скорость
    private int weight;//weight - вес
    private String color; //color -цвет
    private byte[] coordinate;//coordinate - координаты транспорта

    public Transport2(float _speed, int _weight, String _color, byte[] _coordinate){ //конструктор к бмв
        System.out.println("Объект был создан");
        setValues(_speed, _weight, _color, _coordinate);
        //System.out.println(getValues());
    }
    public Transport2(int weight, byte[] coordinate){//конструктор к грузовику truck т.к. принимает такое же кол-во значений
        this.weight = weight;
        this.coordinate = coordinate;
        //System.out.println(getValues());

    }
//Классы наследники от абстрактного класса должны реализовывать все методы абстрактного класса
    public abstract void moveObject(float speed); //абстрактный метод КАК НАПОМИНАЛКА!!
    public abstract boolean stopObject();//абстрактный метод КАК НАПОМИНАЛКА!!

    protected void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }
    protected String getValues(){
        String info = "Object speed: " + this.speed + " Weight: " + this.weight + " Colors: " + this.color + "\n";
        String infoCoordinate = "Coordinates: \n";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinate += coordinate[i] + "\n";
        }
        return info + infoCoordinate;
    } 
    class Engine{ // Engine - двигатель этот класс находится внутри класса Transport2. вложенный класс
        private boolean isReady;//готов или нет тру - двигатель готов к запуску
        private int km;//пробег двигателя
        public void setValues(boolean isReady, int km) { 
            this.isReady = isReady;
            this.km = km;
        }
        public void isReady(boolean isReady){
            this.isReady = isReady;
        }
        public void info(){
            if (isReady) {
                System.out.println("Двигатель готов к запуску! ");
            }
            else {
                System.out.println("Двигатель не работает. Он проехал " + km + "км");
            }
        }
    }


}
