/**
 * Calculate the sum of two integers.
 * @param num1 the first integer to add
 * @param num2 the second integer to add
 * @return the sum of num1 and num2
 */

public class GetSum {

    public int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new GetSum().calculateSum(1, 2));
    }
}