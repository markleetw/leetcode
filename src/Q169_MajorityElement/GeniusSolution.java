package Q169_MajorityElement;

/**
 * Created by marklee on 8/11/16.
 *
 * 3ms, 37.12%
 */
public class GeniusSolution {
    public static int majorityElement(int[] nums) {
        int major = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                major = nums[i];
            } else if (major == nums[i]) {
                count++;
            } else count--;

        }
        return major;
    }

}
