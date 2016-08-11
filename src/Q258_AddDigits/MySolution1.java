package Q258_AddDigits;

/**
 * Created by marklee on 8/10/16.
 * <p>
 * Given a non-negative integer num, repeatedly add all its digits until the
 * result has only one digit.
 * <p>
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has
 * only one digit, return it.
 * <p>
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */
public class MySolution1 {
    public static int addDigits(int num) {
        // you cheat!!
        return (num != 0 && num % 9 == 0) ? 9 : num % 9;
    }

    public static void main(String[] args) {

    }
}
