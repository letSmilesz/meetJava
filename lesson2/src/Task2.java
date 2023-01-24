import java.util.Scanner;

public class Task2 {
    static Scanner scanner = Main.scanner;
    public static void main(String[] args) {
        System.out.println("Write string: ");
        String input = scanner.nextLine();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i == 0 || input.charAt(i) != answer.charAt(answer.length() - 1)) {
                answer.append(input.charAt(i));
            }
        }
        System.out.println(answer);
    }
}
