package Q349_IntersectionOfTwoArrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by marklee on 8/10/16.
 *
 * quick but not easy to read.
 * 6ms, 56.97%
 */
public class MySolution3 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int num1 : nums1) {
            set.add(num1);
        }
        for (int num2 : nums2) {
            if (set.contains(num2)) {
                intersection.add(num2);
            }
        }
        int[] result = new int[intersection.size()];
        int i = 0;
        for (Integer num : intersection) {
            result[i++] = num;
        }
        return result;
    }
}
