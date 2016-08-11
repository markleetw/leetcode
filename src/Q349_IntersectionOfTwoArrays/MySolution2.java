package Q349_IntersectionOfTwoArrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by marklee on 8/10/16.
 *
 * Very simple, but too damn slow!
 * 122ms, 0.91%
 */
public class MySolution2 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums1).distinct().filter(set::contains).toArray();
    }
}
