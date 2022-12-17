package String;

public class rearrangeString {

    public static String reorganizeString(String S) {

        // GFG Solution

        int[] count = new int[26];

        for (int index = 0; index < S.length(); index++) {

            count[S.charAt(index) - 'a']++;

        }

        int maxCount = 0, letter = 0;

        for (int index = 0; index < count.length; index++) {

            if (count[index] > maxCount) {

                maxCount = count[index];

                letter = index;

            }
        }

        if (maxCount > (S.length() + 1) / 2) {      // not possible
            return "";
        }

        char[] result = new char[S.length()];

        int position = 0;

        // first fill up odd indexes with max frequency character(s)

        while (count[letter] > 0) {

            result[position] = (char) (letter + 'a');

            position += 2;

            count[letter]--;

        }

        // fill up odd indexes with remaining characters

        for (int index = 0; index < count.length; index++) {

            while (count[index] > 0) {

                if (position >= result.length) {

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


    }
}
