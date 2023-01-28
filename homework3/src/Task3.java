import java.util.ArrayList;
import java.util.Random;

public class Task3 {
    static Random r = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(-40,41));
        }
        System.out.println(list);
        int[] numbers = findNumbers(list);
        System.out.printf("Min - %d, max - %d, avg - %d", numbers[0], numbers[1], numbers[2]);
    }
    static int[] findNumbers (ArrayList<Integer> arr) {
        int[] res = new int[3];
        res[0] = Integer.MAX_VALUE;
        res[1] = Integer.MIN_VALUE;
        int avg = 0;
        for (Integer a: arr) {
            if (a < res[0]) {
                res[0] = a;
            } else if (a > res[1]) {
                res[1] = a;
            }
            avg += a;
        }
        res[2] = avg / arr.size();
        return res;
    }
}
