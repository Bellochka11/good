package itProger;//пакет //класс транспорт описывает общие характеристики, а классы наследователи уже конкретные хар-ки 
//public class Transport {} - создали класс транспорт
public abstract class Transport { //abstract-абстрактный класс, на его основе нельзя создать объект
    protected float speed;//скорость
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
     public Transport(){}

     public abstract void moveObject(float speed);//абстрактный метод реализовывать не надо!!! КАК НАПОМИНАЛКА
     public abstract boolean stopObject();//абстрактный метод реализовывать не надо!!! КАК НАПОМИНАЛКА

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

    class Engine{//класс двигатель вложен в класс транспорт
        private boolean isReady;//двигатель готов или нет к запуску
        private int km;//пробег двигателя

        public void setValues(boolean isReady, int km){
            this.isReady = isReady;
            this.km = km;
        }
        public void isReady(boolean isReady){
            this.isReady = isReady;
        }

        public void info(){
            if (isReady) {
                System.out.println("Двигатель готов к запуску!");
            }
            else{
                System.out.println("Двигатель не готов к запуску, он проехал " + km + "км");
            }
        }
    }





}
