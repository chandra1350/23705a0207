import java.util.*;

public class OddCountList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 9, 12, 15, 17);

        long count = numbers.stream()
                            .filter(n -> n % 2 != 0)
                            .count();

        System.out.println("Count of odd numbers: " + count);
    }
}
