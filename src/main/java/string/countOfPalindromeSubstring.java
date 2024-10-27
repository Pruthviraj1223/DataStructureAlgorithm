package string;

public class countOfPalindromeSubstring {

    public int countSubstrings(String s) {

        int count = 0;

        for (int index = 0; index < s.length(); index++) {

            count += getCount(s, index, index);

            count += getCount(s, index, index + 1);

        }

        return count;
    }

    int getCount(String s, int i, int j) {

        int count = 0;

        // 12321

        // 1st iteration for : 3   count = 1
        // 2nd iteration for : 232   count = 2
        // 3rd iteration for : 12321   count = 3

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {

            count++;

            i--;

            j++;

        }

        return count;
    }

    public static void main(String[] args) {

        // count

        // watch also : longestPalindromeSubstring

    }
}
