package String;

public class closestString {

    public int[] shortestToChar(String s, char ch) {

        int n = s.length();

        int[] ans = new int[n];

        int prev = Integer.MIN_VALUE / 2;           // for overflow condition

        for (int index = 0; index < n; ++index) {

            if (s.charAt(index) == ch) {

                prev = index;

            }

            ans[index] = index - prev;

        }

        prev = Integer.MAX_VALUE / 2;

        for (int index = n - 1; index >= 0; --index) {

            if (s.charAt(index) == ch) {

                prev = index;

            }

            ans[index] = Math.min(ans[index], prev - index);

        }

        return ans;
    }

    public static void main(String[] args) {

        // this is leetcode
        // https://leetcode.com/problems/determine-if-two-strings-are-close/

        // divisible y 7
        // encrypt the string -2
        // just read out the solution

    }
}
