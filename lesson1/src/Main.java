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
            else if (task == 4) task4();
            else if (task == 5) task5();
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

    public static void task3() { //посчитать максимальное количесво единиц подряд
        System.out.println("Write length of array: ");
        int[] numbers = scanner.nextInt()];
        scanner.nextLine();
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

    public static void task4() { //Дан массив nums = [3,2,2,3] и число val = 3.
 // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
 // Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
        int[] nums = new int[] {3, 2, 2, 3, 2, 2, 4, 7, 3, 3, 3, 4, 3};
        int val = 3;
        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] == val) {
                int temp = 0;
                for (int j = nums.length - 1; j > 0; j--) {
                    if (nums[j] != val) {
                        temp = j;
                        break;
                    }
                }
                int help = nums[i];
                nums[i] = nums[temp];
                nums[temp] = help;
            }
        }
        Main.printArray(nums);
    }

    public static void task5 () { //Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
 //Если общего префикса нет, вернуть пустую строку "".
        String[] str = new String[] {"flower","flow","floght", "florwhb"};
        String prefix = "None";
        int length = str[0].length();
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() < length) length = str[i].length();
        }
        for (int i = 0; i < length; i++) {
            int count = 1;
            char letter = str[0].charAt(i);
            for (int j = 1; j < str.length; j++) {
                if (str[j].charAt(i) == letter) count++;
                else break;
            }
            if (count == str.length) {
                if (prefix.equals("None")) prefix = "";
                prefix += letter;
            }
            else break;
        }
        System.out.println(prefix);
    }

    static void printArray(int[] array) {
        for (int item : array) {
            System.out.printf("%d, ", item);
        }
        System.out.println();
    }
}
