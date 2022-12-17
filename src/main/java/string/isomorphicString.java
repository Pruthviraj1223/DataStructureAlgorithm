package string;

import java.util.HashMap;

public class isomorphicString {

    public boolean isIsomorphic(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Character> mapper = new HashMap<>();

        for (int index = 0; index < s1.length(); index++) {

            if (mapper.containsKey(s1.charAt(index))) {

                if (s2.charAt(index) != mapper.get(s1.charAt(index))) {     // we are checking s1's existing key, and it's value with current s2 value

                    return false;

                }

            } else if (!mapper.containsValue(s2.charAt(index))) {       // here we are creating new entry , before that will check that s2 value must not be present in map . If it is present and also not mapped with s1 key in map then return false.

                mapper.put(s1.charAt(index), s2.charAt(index));

            } else {

                return false;

            }

        }

        return true;

    }

    public static void main(String[] args) {

        //https://leetcode.com/problems/isomorphic-strings/
        // s = "egg", t = "add"


        // Given two strings s and t, determine if they are isomorphic.
        // Two strings s and t are isomorphic if the characters in s can be replaced to get t.

    }
}
