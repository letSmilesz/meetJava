import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    static Random r = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(0, 21));
        }
        System.out.println(list);
        list.removeIf(n -> n % 2 == 0);
        System.out.println(list);
    }
}
