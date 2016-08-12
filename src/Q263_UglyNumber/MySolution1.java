package Q263_UglyNumber;

/**
 * Created by marklee on 8/12/16.
 *
 * Write a program to check whether a given number is an ugly number.
 *
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * For example, 6, 8 are ugly while 14 is not ugly since it includes another
 * prime factor 7.
 *
 * Note that 1 is typically treated as an ugly number.
 *
 * Good enough.
 * 3ms, 3.29%
 */
public class MySolution1 {
    public static boolean isUgly(int num) {
        if (num <= 1) {
            return num == 1;
        }
        boolean result = false;
        if (num % 2 == 0) {
            result = isUgly(num / 2);
        }
        if (num % 3 == 0) {
            result = result || isUgly(num / 3);
        }
        if (num % 5 == 0) {
            result = result || isUgly(num / 5);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(14));
    }
}
