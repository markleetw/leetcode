package Q231_PowerOfTwo;

/**
 * Created by marklee on 8/12/16.
 *
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Simple but slow.
 * 21ms, 0.85%
 */
public class MySolution1 {
    public static boolean isPowerOfTwo(int n) {
        return Integer.toString(n, 2).matches("^10*$");
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(12));
    }
}
