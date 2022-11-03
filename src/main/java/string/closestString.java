package string;

public class closestString {

        public int[] shortestToChar(String S, char C) {

            int N = S.length();

            int[] ans = new int[N];

            int prev = Integer.MIN_VALUE / 2;           // for overflow condition

            for (int i = 0; i < N; ++i) {

                if (S.charAt(i) == C) prev = i;

                ans[i] = i - prev;

            }

            prev = Integer.MAX_VALUE / 2;

            for (int i = N-1; i >= 0; --i) {

                if (S.charAt(i) == C) prev = i;

                ans[i] = Math.min(ans[i], prev - i);

            }

            return ans;
        }

    public static void main(String[] args) {

            // this is leetcode


        // divisible y 7
        // encrypt the string -2
        // just read out the solution

    }
}
