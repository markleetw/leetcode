package Q263_UglyNumber;

/**
 * Created by marklee on 8/12/16.
 *
 * 3ms, 3.29%
 */
public class MySolution2 {
    public static boolean isUgly(int num) {
        if (num <= 1) return num == 1;
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(6));
    }
}
