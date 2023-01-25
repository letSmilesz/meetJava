import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getAnonymousLogger();
    static Scanner scanner = new Scanner(System.in);
    //task1 - Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой
    //итерации запишите в лог-файл.
    //task2 - К калькулятору из предыдущего дз добавить логирование.
    public static void main(String[] args) {
        logger.info("Programme has started");
        while (true) {
            System.out.println("What task do you want to run(to exit enter '0': ");
            int task = scanner.nextInt();
            scanner.nextLine();
            if (task == 0) {
                scanner.close();
                logger.info("Programme has stopped");
                break;
            } else if (task == 1) {
                logger.info("User chose task 1");
                Task1.main(args);
            } else if (task == 2) {
                logger.info("User chose task 2");
                Task2.main(args);
            }
        }
    }
}