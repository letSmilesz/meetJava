import java.time.LocalTime;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Write number of task(to exit write 0): ");
            int task = scanner.nextInt();
            scanner.nextLine();
            if (task == 0) {
                scanner.close();
                break;
            } else if (task == 1) task1();
            else if (task == 2) task2();
            else if (task == 3) task3();
        }
    }

    public static void task1() {
        System.out.println("Write your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void task2() {
        System.out.println("Write your name: ");
        String name = scanner.nextLine();
        String timesOfDay = "night";
        int hour = LocalTime.now().getHour();
        if (hour > 5 && hour < 12) {
            timesOfDay = "morning";
        } else if (hour < 18) {
            timesOfDay = "noon";
        } else if (hour < 23) {
            timesOfDay = "evening";
        }
        System.out.println("Good " + timesOfDay + ", " + name);
    }

    public static void task3() {
        System.out.println("Write length of array: ");
        int[] numbers = new int[10];//scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 2);
        }
        int max_length = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) count += 1;
            else if (numbers[i] == 0) {
                max_length = Math.max(max_length, count);
                count = 0;
            }
        }
        max_length = Math.max(max_length, count);
        printArray(numbers);
        System.out.println("Max length of number '1': " + max_length);
    }

    static void printArray(int[] array) {
        for (int item : array) {
            System.out.printf("%d, ", item);
        }
        System.out.println();
    }
}