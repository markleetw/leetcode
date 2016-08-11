package Q217_ContainsDuplicate;

import java.util.Arrays;

/**
 * Created by marklee on 8/11/16.
 * <p>
 * Given an array of integers, find if the array contains any duplicates. Your
 * function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * <p>
 *
 * Nice, but could be better.
 * 5ms, 97.24%
 */
public class MySolution1 {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 2, 1}));
        System.out.println(containsDuplicate(new int[]{3, 2, 1}));
    }
}
