import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 4, 9, 10, 1, 3};

        // Sort the array
        Arrays.sort(numbers);

        // Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
