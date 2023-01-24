import java.util.Random;
import java.util.Scanner;

public class task1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Write length of string: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Write some symbols separated by comma, which were in string(ex. 'a,g'):");
        String symbols = scanner.nextLine();
        char[] symbolsArray = new char[symbols.length() / 2 + 1];
        for (int i = 0; i < symbols.length(); i += 2) {
            if (!(symbols.charAt(i) == ',')) {
                symbolsArray[i / 2] = symbols.charAt(i);
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            //для полностью случайной строки answer.append(symbolsArray[new Random().nextInt(0, symbolsArray.length)]);
            answer.append(symbolsArray[0]);
            answer.append(symbolsArray[1]);
        }
        System.out.println(answer);
    }
}
