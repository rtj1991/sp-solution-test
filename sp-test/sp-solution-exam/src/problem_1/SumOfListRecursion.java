package problem_1;

public class SumOfListRecursion {
    public static void main(String[] args) {
        int[] numList = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int sum = sumOfList(numList, 0);
        System.out.println("Sum is " + sum);
    }

    public static int sumOfList(int[] numList, int index) {
        if (index == numList.length) {
            return 0;
        }
        return numList[index] + sumOfList(numList, index + 1);
    }
}
