package string;

public class rearrangeString {

    public static String reorganizeString(String s) {

        // GFG Solution


        // count all character frequency

        int[] count = new int[26];

        for (int index = 0; index < s.length(); index++) {

            count[s.charAt(index) - 'a']++;

        }

        // get max count and letter which have the max count

        int maxCount = 0, letter = 0;

        for (int index = 0; index < count.length; index++) {

            if (count[index] > maxCount) {

                maxCount = count[index];

                letter = index;

            }
        }

        if (maxCount > (s.length() + 1) / 2) {      // not possible
            return "";
        }

        char[] result = new char[s.length()];

        int position = 0;

        // fill up even indexes with max frequency character(s)

        while (count[letter] > 0) {

            result[position] = (char) (letter + 'a');

            position += 2;

            count[letter]--;

        }

        // fill up odd indexes with remaining characters

        // result array would be :   [ a , _ , a , _ a , _ a , _ , a , _ , a , _ ]

        for (int index = 0; index < count.length; index++) {

            while (count[index] > 0) {

                if (position >= result.length) {          // suppose in above loop position went above the array length , then need to reset the position ot 1.

                    position = 1;

                }

                result[position] = (char) (index + 'a');

                position += 2;

                count[index]--;

            }
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {

        // no two adjacent char should have same
        // it also have priority queue solution

        // https://leetcode.com/problems/reorganize-string/

    }
}
