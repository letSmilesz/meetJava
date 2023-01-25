import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {
    static Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        int[] array = new int[20];
        array = fillArrayRandom(array);
        System.out.println(Arrays.toString(array));
        array = bubbleSort(array, false);
        System.out.println(Arrays.toString(array));
    }
    static int[] fillArrayRandom (int[] array) {
        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = new Random().nextInt(0, 100);
            }
            logger.log(Level.INFO, "Array was successful felt");
        } catch (Exception e) {
            logger.log(Level.INFO, "Exception: ", e.fillInStackTrace());
        }
        return array;
    }
    static int[] bubbleSort (int[] array, boolean toMax) {
        logger.warning("Starts method of sort, possible exceptions!");
        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if ((toMax && array[j] > array[j + 1]) ||
                            (!toMax && array[j] < array[j + 1])) {
                        logger.info(String.format("i - %d, j - %d iteration: %d <-> %d", i, j, array[j], array[j + 1]));
                        int help = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = help;
                    }
                }
            }
        } catch (Exception e) {
            logger.log(Level.INFO, "Exception: ", e);
        }
        return array;
    }
}
