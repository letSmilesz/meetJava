import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) { //вывести все простые числа от 1 до 1000
        ArrayList<Integer> simpleNumbers = new ArrayList<>();
        simpleNumbers.add(1);
        for (int i = 2; i < 1000; i ++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) flag = false;
            }
            if (flag) simpleNumbers.add(i);
        }
        printList(simpleNumbers);
    }
    static void printList (ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i < arr.size() - 1 && count < 20) {
                count++;
                System.out.printf("%d, ", arr.get(i));
            }
            else {
                count = 0;
                System.out.printf("%d\n", arr.get(i));
            }
        }
    }
}
