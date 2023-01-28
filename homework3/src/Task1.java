import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task1 {
    static Random r = new Random();

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-10, 10);
        }
        System.out.println(Arrays.toString(array));
        array = mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
    static int[] mergeSort (int[] arr) {
        int[] buffer1 = Arrays.copyOf(arr, arr.length);
        int[] buffer2 = new int[arr.length];
        return mergeSortInner(buffer1, buffer2, 0, arr.length);
    }

    static int[] mergeSortInner(int[] arr, int[] arr2, int start, int stop) {
        if (start >= stop - 1) {
            return arr;
        }
        int reference = start + (stop - start) / 2;
        int[] first = mergeSortInner(arr, arr2, start, reference);
        int[] second = mergeSortInner(arr, arr2, reference, stop);

        int index1 = start;
        int index2 = reference;
        int[] result = first == arr ? arr2 : arr;
        for (int i = start; i < stop; i++) {
            if (index1 < reference && index2 < stop) {
                result[i] = first[index1] < second[index2] ? first[index1++] : second[index2++];
            } else if (index1 < reference) {
                result[i] = first[index1++];
            } else {
                result[i] = second[index2++];
            }
        }
        return result;
    }
}
