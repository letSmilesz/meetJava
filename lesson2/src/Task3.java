import java.util.Scanner;

public class Task3 {
    static Scanner scanner = Main.scanner;
    public static void main(String[] args) {
        System.out.println("Write the string: ");
        String input = scanner.nextLine();
        if (isPalindrom(input)){
            System.out.println("It is a palindrom");
        } else {
            System.out.println("It isn`t a palindrom");
        }
    }
    static boolean isPalindrom (String str) {
        int i = 0;
        int j = str.length() - 1;
        while (true) {
            if (i >= j) {
                return true;
            } else if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i += 1;
            j -= 1;
        }
    }
}
