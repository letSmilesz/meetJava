import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("What task you want to run(for exit enter '0'?");
            int task = scanner.nextInt();
            scanner.nextLine();
            if (task == 0) {
                scanner.close();
                break;
            } else if (task == 1) task1.main(args);
            else if (task == 2) task2.main(args);
            else if (task == 3) task3.main(args);
            else if (task == 4) task4.main(args);
        }
    }
}