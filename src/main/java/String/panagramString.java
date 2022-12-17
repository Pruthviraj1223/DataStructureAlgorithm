package String;

public class panagramString {

    public boolean checkIfPanagram(String s) {

        int[] count = new int[26];

        for (int index = 0; index < s.length(); index++) {

            count[s.charAt(index) - 'a']++;

        }

        for (int index = 0; index < 26; index++) {

            if (count[index] == 0) {

                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {

        // https://leetcode.com/problems/check-if-the-sentence-is-pangram/

        // every character of english alphabet must appear only once in string , then it is panagram string

    }
}
