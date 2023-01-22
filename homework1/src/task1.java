import java.util.Scanner;

public class task1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Write number 'n': ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Triangle number is: " + triangleNumber(n));
        System.out.printf("Sum from 0 to %d: %d\n", n, sumFromNull(n));
        System.out.printf("Factorial %d: %d\n", n, factorial(n));
        //System.out.printf("Factorial %d: %d\n", n, recursiveFactorial(n));
    }

    static int triangleNumber(int n) {
        return n * (n + 1) / 2;
    }

    static int sumFromNull (int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    static int factorial (int n) {
        int factorial = 1;
        for (int i = 0; i < n; i++) {
            factorial *= i + 1;
        }
        return factorial;
    }

    static int recursiveFactorial (int n) {
        if (n == 0 || n == 1) return 1;
        else return n * recursiveFactorial(n -1);
    }
}
