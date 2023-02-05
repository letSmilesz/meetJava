import java.util.Scanner;

public class Task3 {
    static Scanner scanner = Main.scanner;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter expression without spaces(ex: 'a+b', to exit enter 'q'): ");
            String expression = scanner.nextLine();
            char[] symbols = expression.toCharArray();
            if (symbols[0] == 'q') {
                return;
            }
            int indexAction = findAction(symbols);
            if (indexAction != symbols.length) {
                int[] numbers = convertToIntArray(symbols, indexAction);
                int answer = calc(numbers, symbols[indexAction]);
                System.out.printf(expression + "=%d\n", answer);
            }
        }
    }

    static int findAction(char[] arr) {
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == '/' || arr[i] == '*' || arr[i] == '+' || arr[i] == '-') break;
        }
        return i;
    }

    static int[] convertToIntArray(char[] arr, int index) {
        int[] res = new int[2];
        StringBuilder number = new StringBuilder();
        int j = 0;
        for (int i = 0; i <= arr.length; ++i) {
            if (i != arr.length && i != index) {
                number.append(arr[i]);
            } else {
                res[j++] = Integer.parseInt(number.toString());
                number = new StringBuilder();
            }
        }
        return res;
    }

    static int calc(int[] nums, char action) {
        int answer;
        if (action == '/') {
            answer = nums[0] / nums[1];
        } else if (action == '*') {
            answer = nums[0] * nums[1];
        } else {
            answer = action == '+' ? nums[0] + nums[1] : nums[0] - nums[1];
        }
        return answer;
    }
}
