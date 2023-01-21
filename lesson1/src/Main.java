import java.time.LocalTime;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class task1 { //написать "Привет, имя"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}

class task2 { //написать время суток, имя
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();
    }
}

class task3 { //найти в массиве самую длинную последовательность единиц
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write length of array: ");
        int[] numbers = new int[10];//scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 2);
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
    public static void printArray(int[] array) {
        for (int item: array) {
            System.out.printf("%d, ", item);
        }
        System.out.println();
    }
}