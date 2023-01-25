import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task2 {
    static Scanner scanner = Main.scanner;
    static Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        while(true) {
            System.out.println("Enter expression without spaces(ex: 'a+b', to exit enter 'q'): ");
            String expression = scanner.nextLine();
            char[] symbols = expression.toCharArray();
            if (symbols[0] == 'q') {
                logger.info("Programme stopped by user");
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
        logger.info("Start search of action");
        int i = 0;
        try {
            for(; i < arr.length; i++) {
                if (arr[i] == '/' || arr[i] == '*' || arr[i] == '+' || arr[i] == '-') break;
            }
        } catch (Exception e) {
            logger.log(Level.INFO, "Exception", e.fillInStackTrace());
        }
        logger.info(String.format("Output value is %d", i));
        return i;
    }

    static int[] convertToIntArray(char[] arr, int index) {
        logger.info("Start convert char array to int numbers");
        int[] res = new int[2];
        StringBuilder number = new StringBuilder();
        int j = 0;
        logger.warning("Possible index out of range!");
        try {
            for(int i = 0; i <= arr.length; ++i) {
                if (i != arr.length && i != index) {
                    number.append(arr[i]);
                } else {
                    res[j++] = Integer.parseInt(number.toString());
                    number = new StringBuilder();
                }
            }
        } catch (Exception e) {
            logger.log(Level.INFO, "Exception: ", e.fillInStackTrace());
        }
        logger.info(String.format("Output value is " + Arrays.toString(res)));
        return res;
    }

    static int calc(int[] nums, char action) {
        logger.info("Start calculations");
        int answer = 0;
        try {
            if (action == '/') {
                answer = nums[0] / nums[1];
            } else if (action == '*') {
                answer = nums[0] * nums[1];
            } else {
                answer = action == '+' ? nums[0] + nums[1] : nums[0] - nums[1];
            }
        } catch (Exception e) {
            logger.log(Level.INFO, "Exception: ", e.fillInStackTrace());
        }
        return answer;
    }
}
