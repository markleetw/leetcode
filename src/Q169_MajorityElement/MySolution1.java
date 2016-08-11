package Q169_MajorityElement;

import java.util.Arrays;

/**
 * Created by marklee on 8/11/16.
 * <p>
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more [ ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 *
 * Improvable.
 * 4ms, 33.87%
 */
public class MySolution1 {
    public static int majorityElement(int[] nums) {
        int threshold = nums.length / 2;
        Arrays.sort(nums);
        int pointer = 0;
        for (int i = 0; i < nums.length - threshold; i++) {
            if (nums[i] != nums[pointer]) {
                if (nums[i] == nums[i + threshold - 1])
                    return nums[i];
                pointer = i;
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
//        System.out.println(majorityElement(new int[]{0, 1}));
//        System.out.println(majorityElement(new int[]{1}));
//        System.out.println(majorityElement(new int[]{0, 1,2,3,2,1,2,2}));
        System.out.println(majorityElement(new int[]{1,1,1,1,1,1,8}));
    }
}
