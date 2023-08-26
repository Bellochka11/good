public class Truck extends Transport2 { //класс Truck наследует все из класса Transport2

    private boolean isLoaded; //isLoaded -загружен ли грузовик

    public Truck(int weight, byte[] coordinate){//конструктор к грузовику truck т.к. принимает такое же кол-во значений
        super(weight, coordinate); // super - точно такое же как this, но обращение к классу родителю
    }

    public Truck(int weight, byte[] coordinate, boolean isLoaded){//конструктор к грузовику truck т.к. принимает такое же кол-во значений
        super(weight, coordinate); // super - точно такое же как this, но обращение к классу родителю
        this.isLoaded = isLoaded;
    }

    public void setLoaded(boolean loaded){
        isLoaded = loaded;
    }
    public void getLoaded(){
        if (isLoaded) {
            System.out.println("Грузовик загружен!");
        }
        else {
            System.out.println("Грузовин не загружен!");
        }    
    }
}
