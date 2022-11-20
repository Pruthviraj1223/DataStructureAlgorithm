package string;

import java.util.Stack;

public class minimumNumberOfBracketReversal {

    static int reversalUsingStack(String s) {

        Stack<Character> stack = new Stack<>();
        int ans = 0;

        for (int index = 0; index < s.length(); index++) {

            if (s.charAt(index) == '{') {

                stack.push(s.charAt(index));

            } else {

                if (!stack.isEmpty()) {

                    stack.pop();

                } else {
                    ans++;
                    stack.push('{');

                }
            }
        }

        ans += stack.size() / 2;

        return ans;

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


    public static void main(String[] args) {

        //min number of bracket need to reverse to make balanced sting

        // leetcode version is added . It's bit different

    }
}
