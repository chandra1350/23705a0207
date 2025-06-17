public class OddCount {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 8, 10, 13, 15};  // Sample input

        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 != 0) {  // Check if number is odd
                oddCount++;
            }
        }

        System.out.println("Count of odd numbers: " + oddCount);
    }
}
