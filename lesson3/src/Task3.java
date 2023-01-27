import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    static Scanner scanner = Main.scanner;
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        fillList(list);
        list = deleteIntegers(list);
        System.out.println(list);
    }
    static void fillList (ArrayList arr) {
        while (true) {
            System.out.println("Enter strings or decimal numbers(to exit enter 'exit'):");
            if (scanner.hasNextInt()) {
                arr.add(scanner.nextInt());
                scanner.nextLine();
            } else if (scanner.hasNext()) {
                String enter = scanner.nextLine();
                if (enter.equals("exit")) {
                    break;
                } else {
                    arr.add(enter);
                }
            }
        }
    }
    static ArrayList<String> deleteIntegers (ArrayList arr) {
        ArrayList<String> arr2 = new ArrayList<>();
        for (Object a: arr) {
            if (a instanceof String) {
                arr2.add(a.toString());
            }
        }
        return arr2;
    }
}
