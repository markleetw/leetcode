package Q191_NumberOf1Bits;

/**
 * Created by marklee on 8/12/16.
 *
 * Write a function that takes an unsigned integer and returns the number of ’1'
 * bits it has (also known as the Hamming weight).
 *
 * For example, the 32-bit integer ’11' has binary representation
 * 00000000000000000000000000001011, so the function should return 3.
 *
 * Can be better.
 * 2ms, 11.91%
 */
public class Mysolution1 {
    public static int hammingWeight(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(0b10000000000000000000000000000000));
    }
}
