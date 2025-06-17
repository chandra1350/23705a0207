public class SimpleMuggulu {
    public static void main(String[] args) {
        int n = 5; // Size of the pattern

        for (int i = 1; i <= n; i++) {
            // Print spaces before stars
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            // Print stars with spaces
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            // Print spaces before stars
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            // Print stars with spaces
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
