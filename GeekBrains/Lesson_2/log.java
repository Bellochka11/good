package GeekBrains.Lesson_2;
import java.util.logging.*;//импортировали все классы библиотеки логгер
// import java.util.logging.Level;
// import java.util.logging.Logger;
//УРОВНИ ВАЖНОСИ:
//INFO, DEBUG, ERROR, WARNING
public class log {
    public static void main(String[] args) {
        Logger LOG = Logger.getLogger(log.class.getName()); //СОЗДАЛИ ЛОГЕР И ПЕРЕДАЛИ ТУДА НАШ КЛАСС log
        LOG.setLevel(Level.INFO);//уровень инфо
        ConsoleHandler ch = new ConsoleHandler();//создали формат вывода ЛОГА в консоль
        LOG.addHandler(ch);//ДОБАВИЛИ ХЭНДЛЕР
        SimpleFormatter sf = new SimpleFormatter(); //создали формат вывода обычный есть еще XML-формат
        //XMLFormatter sf = new XMLFormatter();//создали формат вывода XML
        ch.setFormatter(sf);//формату вывода присвоили обычный формат вывода
        //какая-то программа
        LOG.info("Программа которая ничего не делает");
    }
}
