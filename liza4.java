//если мы говорим про буливые значения(ложь или правда), то если мы сравниваем их по умолчанию они равны true, а !знач = не равно

import java.util.Scanner;

public class liza4 {
    public static void main(String[] args) {
        // boolean car = false;
        // if(car) { //если car равен true, т.к. по умолчению правда. эквивалентно этой записи - if(car == true) 
        //     System.out.println("Тут правда!");
        // }
        // if (!car) {//если не правда (car не равен правде). эквивалентно этой записи - if(car == false)
        //     System.out.println("Тут не правда!");
        // }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String role = scanner.nextLine();
        if (role.equals("Admin")) { //.equals() - надо писать когда мы сравниваем строку. если роль (==) содержит админ
            System.out.println("Все пользователи"); 
        }
        else {
            System.out.println("Привет, " + role);
        }
        int x = 3, a = 12;
        int res = x < a ? (x + a) : (x - a); // если x<а то складываем и кладём в рес, иначе вычитание и кладем в рес
        System.out.println(res);
        int num = scanner.nextInt();
        switch(num){ //проверяем переменную num
            case 1: //если она равна 1
            System.out.println(1);
            break;
            case 5:
            System.out.println(5);
            break;
            default: //работает как else, если ни один case не сработал, то сработает этот код
            System.out.println("вышли!");
        }
    }
}
