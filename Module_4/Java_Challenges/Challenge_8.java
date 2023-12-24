
import java.util.Arrays;
public class Challenge_8 {
    public static void main(String[] args) {
        int[] array = {4, 2, 1, 5, 3, 2, 8, 9, 7, 1, 6, 5, 3, 4, 9, 8, 7, 6};

        System.out.println("Original array: " + Arrays.toString(array));

        countingSort(array, 1, 9);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    private static void countingSort(int[] array, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[array.length];

        // Count occurrences of each element
        for (int value : array) {
            count[value - min]++;
        }

        // Modify count to store the position of each element in the sorted array
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build the sorted array
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }

        // Copy the sorted array back to the original array
        System.arraycopy(output, 0, array, 0, array.length);
    }
}
