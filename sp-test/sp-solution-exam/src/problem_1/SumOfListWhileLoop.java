package problem_1;

public class SumOfListWhileLoop {
    public static void main(String[] args) {
        int[] numList = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int sum = sumOfList(numList);
        System.out.println("Sum is " + sum);
    }

    public static int sumOfList(int[] numList) {
        int total = 0;
        int i = 0;
        while (i < numList.length) {
            total += numList[i];
            i++;
        }
        return total;
    }
}
