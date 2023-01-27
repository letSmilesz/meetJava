import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("What task do you want to run? (to exit enter 0): ");
            int task = scanner.nextInt();
            scanner.nextLine();
            if (task == 0) {
                scanner.close();
                break;
            } else if (task == 1) {
                Task1.main(args);
            } else if (task == 2) {
                Task2.main(args);
            } else if (task == 3) {
                Task3.main(args);
            } else {
                Task4.main(args);
            }
        }
    }
}