import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //task1 - Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
        //которая состоит из чередующихся символов c1 и c2, начиная с c1.
        //task2 - Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd. вывод: abcd
        //task3 - Напишите метод, который принимает на вход строку (String) и определяет является ли строка
        // палиндромом (возвращает boolean значение).
        //task4 - Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
        // который запишет эту строку в простой текстовый файл, обработайте исключения.
        //task5 - Напишите метод, который вернет содержимое текущей папки в виде массива строк. Напишите
        // метод, который запишет массив, возвращенный предыдущим методом в файл. Обработайте ошибки с
        // помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
        while (true) {
            System.out.println("What task you want to run(for exit enter '0'?");
            int task = scanner.nextInt();
            scanner.nextLine();
            if (task == 0) {
                scanner.close();
                break;
            } else if (task == 1) {
                Task1.main(args);
            } else if (task == 2) {
                Task2.main(args);
            } else if (task == 3) {
                Task3.main(args);
            } else if (task == 4) {
                Task4.main(args);
            } else if (task == 5) {
                Task5.main(args);
            }
        }
    }
}