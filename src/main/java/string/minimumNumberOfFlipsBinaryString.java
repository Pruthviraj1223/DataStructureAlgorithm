package string;

public class minimumNumberOfFlipsBinaryString {

    static char flip(Character ch) {

        return (ch == '0') ? '1' : '0';

    }

    static int getFlippedCount(String s,char expected) {

        int flippedCount = 0;

        for (int index = 0; index < s.length(); index++) {

            if (s.charAt(index) != expected) {

                flippedCount++;

            }

            expected = flip(expected);

        }

        return flippedCount;
    }


    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/number-flips-make-binary-string-alternate/

        var ans = Math.min(getFlippedCount("0001010111",'0'),getFlippedCount("0001010111",'1'));

        System.out.println(ans);

    }
}
