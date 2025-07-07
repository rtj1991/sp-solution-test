package problem_4;

import java.util.Arrays;

public class LargestNumberFromList {
    public static String formLargestNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) return "0";

        String[] strNumbs = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(strNumbs, (a, b) -> (b + a).compareTo(a + b));

        if (strNumbs[0].equals("0")) return "0";

        return String.join("", strNumbs);
    }

    public static void main(String[] args) {
        int[] input = {50, 2, 1, 9};
        System.out.println("Largest Number: " + formLargestNumber(input));

    }


}
