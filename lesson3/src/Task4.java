import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    static Scanner scanner = Main.scanner;
    static ArrayList<ArrayList<String>> books = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("What do you want to do? (add book/genre, watch genres, watch books, exit)");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("add book")) {
                general(1);
            } else if (action.equalsIgnoreCase("add genre")) {
                general(2);
            } else if (action.equalsIgnoreCase("watch genres")) {
                printGenres();
            } else if (action.equalsIgnoreCase("watch books")) {
                printBooksGeneral();
            } else {
                break;
            }
        }
    }

    static void general(int action) {
        System.out.println("What genre?");
        String genre = scanner.nextLine();
        if (action == 1) {
            System.out.println("Write name of book: ");
            String book = scanner.nextLine();
            if (checkGenre(genre)) {
                addBook(genre, book);
            } else {
                addGenre(genre);
                addBook(genre, book);
            }
        } else if (action == 2) {
            if (checkGenre(genre)) {
                System.out.println("Genre has already been");
            } else {
                addGenre(genre);
            }
        }
    }

    static void printBooksGeneral() {
        System.out.println("Do you want watch all books? y/n");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            printBooks("", false);
        } else {
            System.out.println("Enter the genre what do you want to see: ");
            String genre = scanner.nextLine();
            printBooks(genre, true);
        }

    }

    static boolean checkGenre(String genre) {
        if (books.size() >= 1) {
            for (ArrayList<String> genres : books) {
                if (genres.get(0).equals(genre)) {
                    return true;
                }
            }
        }
        return false;
    }

    static void addGenre(String genre) {
        books.add(new ArrayList<>());
        books.get(books.size() - 1).add(genre);
    }

    static void addBook(String genre, String book) {
        for (ArrayList<String> genres : books) {
            if (genres.get(0).equals(genre)) {
                genres.add(book);
            }
        }
    }

    static void printGenres() {
        for (int i = 0; i < books.size(); i++) {
            if (i != books.size() - 1) {
                System.out.printf("%s,", books.get(i).get(0));
            } else {
                System.out.println(books.get(i).get(0));
            }
        }
    }

    static void printBooks(String genre, boolean byGenre) {
        for (ArrayList<String> genres : books) {
            if (byGenre && !genres.get(0).equals(genre)) {
                continue;
            } else {
                System.out.printf("%s - ", genres.get(0));
            }
            for (int i = 1; i < genres.size(); i++) {
                if (i != genres.size() - 1) {
                    System.out.printf("%s,", genres.get(i));
                } else {
                    System.out.println(genres.get(i));
                }
            }
        }
    }
}
