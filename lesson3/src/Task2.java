import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    static Random r = new Random();
    static String[] nameOfPlanets = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
            "Uranus", "Neptune"};

    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        fillArray(planets);
        System.out.println(planets);
        int[] count = countOfRepeats(planets);
        for (int i = 0; i < nameOfPlanets.length; i++) {
            System.out.printf("%s - %d\n", nameOfPlanets[i], count[i]);
        }
        deleteRepeats(planets, count);
        System.out.println(planets);
    }

    static void fillArray(ArrayList<String> arr) {
        int length = nameOfPlanets.length;
        for (int i = 0; i < r.nextInt(10, 20); i++) {
            arr.add(nameOfPlanets[r.nextInt(0, length)]);
        }
    }

    static int[] countOfRepeats(ArrayList<String> arr) {
        int[] counts = new int[nameOfPlanets.length];
        for (String planet : arr) {
            for (int i = 0; i < nameOfPlanets.length; i++) {
                if (planet.equals(nameOfPlanets[i])) {
                    counts[i]++;
                    break;
                }
            }
        }
        return counts;
    }

    static void deleteRepeats(ArrayList<String> arr, int[] repeats) {
        for (int i = 0; i < repeats.length; i++) {
            int j = arr.size() - 1;
            while (repeats[i] > 1) {
                if (nameOfPlanets[i].equals(arr.get(j))) {
                    arr.remove(j);
                    repeats[i]--;
                }
                j--;
            }
        }
    }
}
