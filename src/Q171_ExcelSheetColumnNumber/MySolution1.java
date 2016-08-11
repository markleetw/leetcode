package Q171_ExcelSheetColumnNumber;

/**
 * Created by marklee on 8/11/16.
 * <p>
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * <p>
 * For example:
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 *
 * Too slow.
 * 5ms, 6.04%
 */
public class MySolution1 {
    public static int titleToNumber(String s) {
        int num = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] cArr = s.toLowerCase().toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            num += Math.pow(26, i) * (alphabet.indexOf(cArr[cArr.length - i - 1]) + 1);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AA"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("BA"));
        System.out.println(titleToNumber("AAA"));
//        System.out.println(Math.pow(2, 3));
    }
}
