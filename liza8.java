import java.util.LinkedList;

public class liza8 {
    public static void main(String[] args) {
        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.7f);
        numbers.add(54.76f);
        numbers.add(5.742f);
        for(Float el : numbers){
            System.out.println(el);
        }
    }
}
