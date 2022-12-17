package String;

public class longestPalindromeSubstring {

    int low, maxLen;

    public String longestPalindrome(String s) {

        int len = s.length();

        if (len < 2)
            return s;

        for (int index = 0; index < s.length() - 1; index++) {

            getCount(s, index, index);                          // for odd length , 12321

            getCount(s, index, index + 1);                   // for even length , 1221

        }

        return s.substring(low, low + maxLen);
    }

    void getCount(String s, int i, int j) {

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {

            i--;

            j++;
        }

        if (maxLen < j - i - 1) {

            low = i + 1;
            maxLen = j - i - 1;

        }
    }

    public static void main(String[] args) {

        // https://leetcode.com/problems/longest-palindromic-substring/description/

        // very good logic and how they have combined these logics together

    }
}
