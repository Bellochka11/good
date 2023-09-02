public class Truck extends Transport2 { //класс Truck наследует все из класса Transport2

    private boolean isLoaded; //isLoaded -загружен ли грузовик
    public Engine engine = new Engine();//Engine - вложенный класс в транспорт

    public Truck(int weight, byte[] coordinate){//конструктор к грузовику truck т.к. принимает такое же кол-во значений
        super(weight, coordinate); // super - точно такое же как this, но обращение к классу родителю
    }

    public Truck(int weight, byte[] coordinate, boolean isLoaded){//конструктор к грузовику truck т.к. принимает такое же кол-во значений
        super(weight, coordinate); // super - точно такое же как this, но обращение к классу родителю
        this.isLoaded = isLoaded;
    }

    //@Override //аннотация
    public void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
        super.setValues(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    protected String getValues(){
        System.out.println(super.getValues());
        return getLoaded();
    }


    public void setLoaded(boolean loaded){
        isLoaded = loaded;
    }
    public String getLoaded(){
        if (isLoaded) {
            return "Грузовик загружен!";
        }
        else {
            return "Грузовин не загружен!";
        }    
    }

    @Override
    public void moveObject(float speed) { //абстрактный метод
        System.out.println("Наш объект движется со скоростью: " + speed);
        
    }

    @Override//абстрактный метод
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }
}
