package Q350_IntersectionOfTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by marklee on 8/11/16.
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 *
 * Good job!
 * 4ms, 84.91%
 */
public class MySolution1 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> intersect = new ArrayList<>();
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] == nums2[j]) {
                intersect.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] result = new int[intersect.size()];
        for (int i = 0 ; i < result.length ; i++) {
            result[i] = intersect.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Arrays.stream(intersect(new int[] {3}, new
                int[]{})).forEach(System.out::print);
    }
}
