package String;

import java.util.Stack;

public class removeDuplicateLetters {

    String remove(String s) {

        if (s.isEmpty()) {
            return "";
        }

        int[] lastIndex = new int[26];

        for (int index = 0; index < s.length(); index++) {

            lastIndex[s.charAt(index) - 'a'] = index;

        }

        // cbacdcbc
        // cbacdcc

        Stack<Integer> st = new Stack<>();

        boolean[] seen = new boolean[26];

        for (int index = 0; index < s.length(); index++) {

            int curr = s.charAt(index) - 'a';

            if (seen[curr]) {
                continue;
            }

            // curr < st.peek() : to maintain lexicographically order
            // index < lastIndex[st.peek()] : peek character is present or not ahead in string

            while (!st.isEmpty() && curr < st.peek() && index < lastIndex[st.peek()]) {

                seen[st.pop()] = false;

            }

            st.push(curr);

            seen[curr] = true;

        }

        StringBuilder res = new StringBuilder();

        while (!st.isEmpty()) {

            char ch = (char) (st.pop() + 'a');

            res.append(ch);

        }

        return res.reverse().toString();

    }

    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/remove-duplicates-from-a-given-string/

        // multiple way in GFG.
        // 1 . Set solution
        // 2 . Character array sorted and then add into string
        // 3 . Contains
        // 4 . indexOf

        // Always propose the simple solution first.

        // Given solution is a bit complex from leetcode
        // but Must watch to know how to write a good code.
        // Nice thinking 

    }
}
