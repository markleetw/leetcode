package Q283_MoveZeroes;

import static java.util.Arrays.stream;

/**
 * Created by marklee on 8/10/16.
 *
 * filled with zero
 */
public class MySolution2 {
    public static void moveZeroes(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx++] = nums[i];
            }
        }
        for (; idx < nums.length; idx++) {
            nums[idx] = 0;
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
