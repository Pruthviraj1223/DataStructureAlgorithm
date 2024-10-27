package string;

public class KMP_LPS {

    void KMPSearch(String pattern, String text) {

        int M = pattern.length();

        int N = text.length();

        int[] LPS = longestPrefix(pattern);

        int j = 0; // index for pat[]

        int i = 0;

        while ((N - i) >= (M - j)) {

            if (pattern.charAt(j) == text.charAt(i)) {

                j++;

                i++;
            }

            if (j == M) {

                System.out.println("Found pattern " + "at index " + (i - j));

                j = LPS[j - 1];

            } else if (i < N && pattern.charAt(j) != text.charAt(i)) {       // if char dont match ,then backtrack

                if (j != 0) {

                    j = LPS[j - 1];                                 // backtrack using LPS and at that you don't increase the i.

                } else {

                    i = i + 1;                                        // it means j = 0 , you can not backtrack anymore

                }
            }
        }
    }

    public int[] longestPrefix(String s) {

        // abcdefabclpoabcbczetabcde
        // all scenario will be cover in this example

        int n = s.length();

        int position = 0;

        int index = 1;

        int[] longestPrefixSuffix = new int[n];

        while (index < n) {

            if (s.charAt(index) == s.charAt(position)) {

                position++;

                longestPrefixSuffix[index] = position;

                index++;

            } else {

                if (position != 0) {     // backtrack len           // ex : 'abc'zisdufdj'abcbc'sap

                    position = longestPrefixSuffix[position - 1];       // do not increase index

                } else {        // len == 0

                    index++;

                }
            }
        }

        return longestPrefixSuffix;

    }

    public static void main(String[] args) {

        // Abdul bari to understand the concept

    }
}
