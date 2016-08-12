package Q070_ClimbingStairs;

/**
 * Created by marklee on 8/13/16.
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 *
 * Perfect!
 * 0ms, 11.09%
 */
public class MySolution1 {
    public static int climbStairs(int n) {
        double ways = 1;
        for (int i = 1; i <= n / 2; i++) {
            double factorial = 1;
            for (double j = n - i, k = i; k > 0; j--, k--) {
                factorial *= j / k;
            }
            ways += factorial;
        }
        return (int) ways;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
}
