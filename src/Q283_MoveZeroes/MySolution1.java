package Q283_MoveZeroes;

import static java.util.Arrays.stream;

/**
 * Created by marklee on 8/10/16.
 * <p>
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * <p>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function,
 * nums should be [1, 3, 12, 0, 0].
 * <p>
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 *
 * swap
 */
public class MySolution1 {
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != idx) {
                    // swap
                    int tmp = nums[idx];
                    nums[idx] = nums[i];
                    nums[i] = tmp;
                }
                idx++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        stream(nums).forEach(System.out::println);
//        nums = null;
//        moveZeroes(nums);
//        stream(nums).forEach(System.out::println);
//        int[] nums = {1, 0};
//        moveZeroes(nums);
//        stream(nums).forEach(System.out::println);
//        int[] nums = {2, 1};
//        moveZeroes(nums);
//        stream(nums).forEach(System.out::println);
    }
}
