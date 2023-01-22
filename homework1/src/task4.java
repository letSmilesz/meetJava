import java.util.Scanner;

public class task4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { //добавить недостающие цифры
        System.out.println("Enter the expression(ex. '2?+?5=69'): ");
        String expression = scanner.nextLine();
        char[] exp = expression.toCharArray();
        int[] numbers = convertToIntArray(exp);
        int[][] help = new int[2][3];//вспомогательный массив, хранящий индексы знаков и
        // индексы неизвестных элементов в порядке их вычисления + совпадают ли разряды
        help[0][0] = findIndexOfNumber(numbers, -2);//+
        help[0][1] = findIndexOfNumber(numbers, -3);//=
        help = checkSequence(numbers, help);
        if (help[1][2] == 1) {
            numbers = selection(numbers, help);
        } else {
            numbers = calculations(numbers, help);
        }
        help[1] = joinIntToArr(numbers);
        if (help[1][0] + help[1][1] == help[1][2]) System.out.printf("%d+%d=%d\n", help[1][0], help[1][1], help[1][2]);
        else System.out.println("The expression hasn`t got answers");
    }

    static int[] convertToIntArray(char[] arr) {
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') nums[i] = -1;
            else if (arr[i] == '+') nums[i] = -2;
            else if (arr[i] == '=') nums[i] = -3;
            else nums[i] = Character.digit(arr[i], 10);
        }
        return nums;
    }

    static int findIndexOfNumber(int[] arr, int value) {
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == value) break;
        }
        return i;
    }

    static int[][] checkSequence(int[] arr, int[][] res) {
        int[] sequence = new int[2];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                res[1][j] = i;
                if (i % 3 == 1) sequence[j] = 0;//единицы
                else sequence[j] = 1;//десятки
                j++;
            }
        }
        if (sequence[0] > sequence[1]) {
            int help = res[1][0];
            res[1][0] = res[1][1];
            res[1][1] = help;
            res[1][2] = 0;
        } else if (sequence[0] == sequence[1]) {
            res[0][2] = sequence[0];
            res[1][2] = 1;
        } else res[1][2] = 0;//проверка на совпадение разрядов
        return res;
    }
    static int[] selection (int[] numbers, int[][] help) {
        int res = numbers[help[0][1] + 2];
        if (help[0][2] == 1) res = numbers[help[0][1] + 1];
        if (res != 0) {
            numbers[help[1][0]] = res - 1;
        } else {
            numbers[help[1][0]] = 0;
            numbers[help[1][1]] = 0;
        }
        int num1 = joinInt(numbers, 0, 2);
        int num2 = joinInt(numbers, help[0][1] + 1, help[0][1] + 3);
        if (help[0][2] == 1) {
            numbers[help[1][1]] = (num2 - num1) / 10;
        } else {
            numbers[help[1][1]] = (num2 - num1) % 10;
        }
        return numbers;
    }
    static int joinInt (int[] numbers, int start, int stop) {
        String num = "";
        for (int j = start; j < stop; j++) {
            num += numbers[j];
        }
        return Integer.parseInt(num);
    }

    static int[] calculations(int[] numbers, int[][] help) {
        boolean flag = false;
        for (int i = 0; i < 2; i++) {
            int res = numbers[help[0][1] + 2];
            int num = numbers[help[1][1] + 1];
            if (i == 1) {
                res = numbers[help[0][1] + 1];
                num = numbers[help[1][0] - 1];
            }
            if (flag) numbers[help[1][i]] = res - num - 1;
            else numbers[help[1][i]] = res - num;
            if (numbers[help[1][i]] < 0) {
                numbers[help[1][i]] += 10;
                flag = true;
            }
        }
        return numbers;
    }

    static int[] joinIntToArr(int[] arr) {
        int[] res = new int[3];
        String ans = "";
        int j = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length || arr[i] == -2 || arr[i] == -3) {
                res[j++] = Integer.parseInt(ans);
                ans = "";
            } else {
                ans += arr[i];
            }
        }
        return res;
    }
}