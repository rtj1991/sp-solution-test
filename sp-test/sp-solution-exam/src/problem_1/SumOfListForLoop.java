package problem_1;

public class SumOfListForLoop {
    public static void main(String[] args) {
        int[] numList = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int sum = sumOfList(numList);
        System.out.println("Sum is " + sum);
    }

    public static int sumOfList(int[] numList) {
        int total = 0;
        for (int j : numList) {
            total += j;
        }
        return total;
    }
}
