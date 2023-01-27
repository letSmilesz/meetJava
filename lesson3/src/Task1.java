import java.util.*;

public class Task1 {
    static Random r = new Random();
    public static void main(String[] args) {
        int length = r.nextInt(10, 20);
        List<Integer> list = fillList(length);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
    static ArrayList<Integer> fillList (int length) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arr.add(r.nextInt(0,20));
        }
        return arr;
    }
}
