package Q191_NumberOf1Bits;

/**
 * Created by marklee on 8/12/16.
 */
public class LeetcodeSolution {
    /**
     * Awesome!
     */
    public int hammingWeight1(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1; // shift 1 bit to left
        }
        return bits;
    }

    /**
     * Brilliant!
     */
    public int hammingWeight2(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }
}
