package String;

public class KMP_LPS {

    void KMPSearch(String pat, String txt) {

        int M = pat.length();

        int N = txt.length();

        int[] lps = new int[M];

        int j = 0; // index for pat[]

        longestPrefix(pat);

        int i = 0;

        while ((N - i) >= (M - j)) {

            if (pat.charAt(j) == txt.charAt(i)) {

                j++;

                i++;
            }

            if (j == M) {

                System.out.println("Found pattern "
                        + "at index " + (i - j));

                j = lps[j - 1];

            } else if (i < N && pat.charAt(j) != txt.charAt(i)) {

                if (j != 0)

                    j = lps[j - 1];

                else

                    i = i + 1;
            }
        }
    }

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
