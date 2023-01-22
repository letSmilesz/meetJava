import java.util.ArrayList;
import java.util.Scanner;

public class task3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {//написать калькулятор(проще некуда)
        while (true) {
            System.out.println("Enter expression without spaces(ex: 'a+b', to exit enter 'q'): ");
            String exppression = scanner.nextLine();
            char[] exp = exppression.toCharArray();
            int indexAction= findAction(exp);
            if (exp[0] == 'q') break;
            else if (indexAction == exp.length) continue;
            int[] numbers = convertToIntArray(exp, indexAction);
            int answer = calc(numbers, exp[indexAction]);
            System.out.printf(exppression + "=%d\n", answer);
        }
    }

    static int findAction (char[] arr) {
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == '/' || arr[i] == '*' || arr[i] == '+' || arr[i] == '-') break;
        }
        return i;
    }

    static int[] convertToIntArray (char[] arr, int index) {
        int[] res = new int[2];
        String number = "";
        int j = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length || i == index) {
                res[j++] = Integer.parseInt(number);
                number = "";
            } else number += arr[i];
        }
        return res;
    }

    static int calc (int[] nums, char action) {
        if (action == '/') return nums[0] / nums[1];
        else if (action == '*') return nums[0] * nums[1];
        else if (action == '+') return nums[0] + nums[1];
        else return nums[0] - nums[1];
    }
}
