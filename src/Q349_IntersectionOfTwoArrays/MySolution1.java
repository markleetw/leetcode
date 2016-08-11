package Q349_IntersectionOfTwoArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Created by marklee on 8/10/16.
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 *
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 *
 * Too slow.
 * 44ms, 3.98%
 */
public class MySolution1 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null ||
                nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }
        Iterator<Integer> iterator = Stream.concat(
                Arrays.stream(nums1).distinct().boxed(),
                Arrays.stream(nums2).distinct().boxed()).sorted(Integer::compare).iterator();
        HashSet<Integer> numsSet = new HashSet<>();
        Integer num1 = iterator.next();
        while (iterator.hasNext()) {
            Integer num2 = iterator.next();
            if (num1.equals(num2)) {
                numsSet.add(num2);
            }
            if (iterator.hasNext()) {
                num1 = num2;
            }
        }
        return numsSet.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
//        int[] result = intersection(new int[] {1, 2, 2, 1,3,3,4}, new int[] {2, 2,4,4,4});
        int[] result = intersection(new int[]{}, new int[]{});
        Arrays.stream(result).forEach(System.out::println);
    }
}
