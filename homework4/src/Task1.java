import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    static Random r = new Random();
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(0, 100));
        }
        System.out.println(list);
        list = reverseList(list);
        System.out.println(list);

    }
    static LinkedList<Integer> reverseList (LinkedList<Integer> list) {
        LinkedList<Integer> new_list = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            new_list.add(list.get(i));
        }
        return new_list;
    }
}
