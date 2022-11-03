package string;

public class panagramString {

    public boolean checkIfPangram(String s) {

        int[] count = new int[26];

        for (int index = 0; index < s.length(); index++) {

            char ch = s.charAt(index);

            count[ch - 'a']++;

        }

        for (int index = 0; index < 26; index++) {

            if (count[index] == 0) {

                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {

    }
}
