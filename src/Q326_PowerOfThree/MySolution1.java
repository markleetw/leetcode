package Q326_PowerOfThree;

/**
 * Created by marklee on 8/12/16.
 *
 * Given an integer, write a function to determine if it is a power of three.
 *
 * Follow up:
 * Could you do it without using any loop / recursion?
 *
 * Quick but I don't like it.
 * 18ms, 60.90%
 */
public class MySolution1 {
    public static boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        return 1162261467 % n == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(81));
    }
}
