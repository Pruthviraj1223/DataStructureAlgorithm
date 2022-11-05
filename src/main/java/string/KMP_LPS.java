package string;

public class KMP_LPS {

    public String longestPrefix(String s) {

        // abcdefabclpoabcbczetabcde
        // all scenario will be cover in this example

        int n = s.length();

        int len = 0;

        int index = 1;

        int[] longestPrefixSuffix = new int[n];

        while (index < n) {

            if (s.charAt(index) == s.charAt(len)) {

                len++;

                longestPrefixSuffix[index] = len;

                index++;

            } else {

                if (len != 0) {     // backtrack len

                    len = longestPrefixSuffix[len - 1];

                } else {        // len == 0

                    index++;

                }
            }
        }

        return s.substring(0, longestPrefixSuffix[n - 1]);


    }

    public static void main(String[] args) {

    }
}
