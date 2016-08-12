package Q231_PowerOfTwo;

/**
 * Created by marklee on 8/12/16.
 *
 * Quick but not smart.
 * 2ms, 19.75%
 */
public class MySolution2 {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && 1073741824 % n == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(6));
        System.out.println(isPowerOfTwo(8));
    }
}
