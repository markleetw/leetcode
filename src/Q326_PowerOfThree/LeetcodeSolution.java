package Q326_PowerOfThree;

/**
 * Created by marklee on 8/12/16.
 */
public class LeetcodeSolution {


    /**
     * Brilliant!
     */
    public boolean isPowerOfThree1(int n) {
        return Integer.toString(n, 3).matches("^10*$");
    }

    /**
     * Not perfect.
     */
    public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
