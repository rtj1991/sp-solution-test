package problem_3;

public class FibonacciSeries {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(printFibonacciSequenceRecursion(i));
        }
    }

    private static int printFibonacciSequenceRecursion(int count) {
        if (count <= 1)
            return count;
        int i = printFibonacciSequenceRecursion(count - 1);
        int i1 = printFibonacciSequenceRecursion(count - 2);
        return i + i1;
    }
}
