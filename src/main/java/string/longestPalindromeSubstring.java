package string;

public class longestPalindromeSubstring {

    int low, maxLen;

    public String longestPalindrome(String s) {

        int len = s.length();

        if (len < 2)
            return s;

        for (int index = 0; index < s.length() - 1; index++) {

            getCount(s, index, index);

            getCount(s, index, index + 1);

        }

        return s.substring(low, low + maxLen);
    }


    void getCount(String s, int j, int k) {

        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {

            j--;

            k++;
        }

        if (maxLen < k - j - 1) {

            low = j + 1;
            maxLen = k - j - 1;

        }


    }


    public static void main(String[] args) {

    }
}
