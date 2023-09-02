package itProger;

public class Object {
    public static void main(String[] args) {

    //создали объект бмв на основе класса транспорт и передали значения в конструктор
        Transport bmw = new Transport(250.5f, 2500, "White", new byte[] {0,0,0});
    //создали объект грузовик на основе класса транспорт и передали значения в конструктор
        Transport truck = new Transport(5600, new byte[] {100,0,100});
        // truck.speed = 140.5f;
        // truck.color = "Red";
        // String res2 = truck.getValues();
        // System.out.println(res2);
    }
}