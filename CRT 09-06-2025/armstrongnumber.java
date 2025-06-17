import java.util.Scanner;

public class ArmstrongNumberAlt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        sc.close();
    }

    static boolean isArmstrong(int num) {
        int original = num;
        int temp = num;
        int digits = 0;

        // Count the number of digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int result = 0;
        temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            // Calculate digit raised to 'digits' power
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }

            result += power;
            temp /= 10;
        }

        return result == original;
    }
}
