package Q013_RomanToInteger;

/**
 * Created by marklee on 8/11/16.
 *
 * Given a roman numeral, convert it to an integer.
 *
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 * Nice but could be better.
 * 7ms, 81.19%
 */
public class MySolution1 {
    public static int romanToInt(String s) {
        int[] nums = new int[s.length()];
        for(int i = 0 ; i < s.length();i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    nums[i] = 1;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'M':
                    nums[i] = 1000;
                    break;
                default:
                    nums[i] = 0;
            }
        }
        int result = 0;
        for (int i = 0; i < nums.length;i++) {
            if (i == nums.length - 1 || nums[i] >= nums[i+1]) {
                result += nums[i];
            } else {
                result -= nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt(""));
        System.out.println(romanToInt("IIIIVX"));
        System.out.println(romanToInt("DCXXI"));
    }
}
