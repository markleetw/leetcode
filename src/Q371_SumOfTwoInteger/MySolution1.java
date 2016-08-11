package Q371_SumOfTwoInteger;

/**
 * Created by marklee on 8/10/16.
 * <p>
 * Calculate the sum of two integers a and b, but you are not allowed to use
 * the operator + and -.
 * <p>
 * Example:
 * Given a = 1 and b = 2, return 3.
 */
public class MySolution1 {
    public static int getSum(int a, int b) {
        // not that good.
        return Integer.sum(a, b);
    }

    public static void main(String[] args) {
        System.out.println(getSum(1, 2));
        System.out.println(getSum(3, 5));
        System.out.println(getSum(0, -3));
    }

}
