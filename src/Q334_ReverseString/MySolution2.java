package Q334_ReverseString;

/**
 * Created by marklee on 8/11/16.
 *
 * Good readability.
 * 4ms, 37.09%
 */
public class MySolution2 {
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
