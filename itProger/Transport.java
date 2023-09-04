package itProger; //класс транспорт описывает общие характеристики, а классы наследователи уже конкретные хар-ки 
//public class Transport {} - создали класс транспорт
public class Transport {
    private float speed;//скорость
    private int weight;//вес
    private String color;//цвет
    private byte[] coordinate;//координаты


    // СОЗДАЛИ КОНСТРУКТОР ДЛЯ БМВ - public Transport() {} при создании объекта будет выполняться код в {} скобках! 4 ПАРАМЕТРА
     public Transport(float speed, int weight, String color, byte[] coordinate) { 
        System.out.println("Объект был создан");
        setValues(speed, weight, color, coordinate);
        //System.out.println(getValues());
     }
     //СОЗДАЛИ КОНСТРУКТОР ДЛЯ ГРУЗОВИКА. 2 ПАРАМЕТРА
     public Transport(int weight, byte[] coordinate) { 
        this.weight = weight;//this - значит что я обращаюсь к классу Transport и вытягиваю из него что-либо
        this.coordinate = coordinate;
        //System.out.println(getValues());
     }


    protected void setValues(float speed, int weight, String color, byte[] coordinate){ //setValues - установка значений
        this.speed = speed; //this - значит что я обращаюсь к классу Transport и вытягиваю из него что-либо
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }
    protected String getValues(){ //getValues - получение значений. ВЫВОД В ТЕРМИНАЛ
        String info = "Скорость: " + this.speed + ". Вес: " + this.weight + ". Цвет: " + this.color + ".\n";
        String infoCoordinates = "Координаты: \n";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinates += coordinate[i] + "\n";
        }
        return info + infoCoordinates;

    }





}
