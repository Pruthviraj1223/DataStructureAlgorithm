package string;

import java.util.Stack;

public class minimumNumberOfBracketReversal {

    static int reversalUsingStack(String s) {

        Stack<Character> stack = new Stack<>();

        int result = 0;

        for (int index = 0; index < s.length(); index++) {

            if (s.charAt(index) == '{') {

                stack.push(s.charAt(index));

            } else {

                if (!stack.isEmpty()) {

                    stack.pop();

                } else {

                    result++;

                    stack.push('{');

                }
            }
        }

        result += stack.size() / 2;

        return result;

    }

    static int reversalUsingTemp(String s) {

        int ans = 0;
        int temp = 0;

        for (int index = 0; index < s.length(); index++) {

            if (s.charAt(index) == '{') {

                temp++;

            } else {

                if (temp == 0) {

                    ans++;
                    temp++;

                } else {

                    temp--;

                }
            }
        }

        if (temp > 0) {

            ans += temp / 2;

        }

        return ans;

    }

    public int minAddToMakeValidLeetcode(String s) {

        int ans = 0;
        int temp = 0;

        for (int index = 0; index < s.length(); index++) {

            if (s.charAt(index) == '(') {

                temp++;

            } else {

                if (temp == 0) {

                    ans++;

                } else {

                    temp--;

                }
            }
        }

        if (temp > 0) {

            ans += temp;

        }

        return ans;

    }

    public int minSwaps(String s) {

        int result = 0;

        int temp = 0;

        //Input: s = "]]][[["

        for (int index = 0; index < s.length(); index++) {

            if (s.charAt(index) == '[') {

                temp++;

            } else {

                if (temp > 0) {

                    temp--;

                } else {

                    result++;

                }
            }
        }

        return (result + 1) / 2;        // why divide by 2 ?
    }


    public static void main(String[] args) {

        // https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/submissions/

        // only focus on this one question.

        // minSwaps
    }
}
