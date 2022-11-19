package string;

import java.util.HashMap;

class Solution {

    public String minWindow(String s, String t) {

        if (s == null || s.length() < t.length() || s.length() == 0) {
            return "";
        }

        HashMap<Character, Integer> count = new HashMap<>();

        for (int index = 0; index < t.length(); index++) {

            count.put(t.charAt(index), count.getOrDefault(t.charAt(index), 0) + 1);

        }

        int left = 0;
        int minLeft = 0;
        int minLen = s.length() + 1;
        int length = 0;

//        Input: s = "ADOBECODEBANC", t = "ABC"
//        count : [A,1] , [B,1] , [C,1]

        for (int right = 0; right < s.length(); right++) {

            if (count.containsKey(s.charAt(right))) {

                count.put(s.charAt(right), count.get(s.charAt(right)) - 1);

                if (count.get(s.charAt(right)) >= 0) {      // if count goes less than zero , its duplicate
                    length++;
                }

                // (length == t.length()) :  why this condition because length keep track of that , do we have removed important character or not , if yes then do length-- and break the loop else it continues to shrink the left pointer

                while (length == t.length()) {

                    if (right - left + 1 < minLen) {        // for minLeft and minLen
                        minLeft = left;
                        minLen = right - left + 1;
                    }

                    // having count zero or less for any character in map indicates that , that particular char is being used in the part of current window
                    // and if it has count > 0 then it shows that it's not part of current window and that time we will decrease the length

                    if (count.containsKey(s.charAt(left))) {

                        count.put(s.charAt(left), count.get(s.charAt(left)) + 1);

                        if (count.get(s.charAt(left)) > 0) {    // even after adding one it is zero or less than then it's duplicate character , let left be ++.

                            length--;
                        }
                    }

                    left++;                     // this is for shrinking left towards right

                }
            }
        }

        if (minLen > s.length()) {

            return "";

        }

        return s.substring(minLeft, minLeft + minLen);
    }
}

public class minimumWindowsSubString {
    public static void main(String[] args) {
        new Solution().minWindow("ADOBECODEBANC", "ABC");
    }
}
