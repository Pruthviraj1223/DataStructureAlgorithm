package String;

public class palindromSubstring {

    public int countSubstrings(String s) {

        int count = 0;
        for (int index = 0; index < s.length(); index++) {

            count += getCount(s, index, index);
            count += getCount(s, index, index + 1);

        }

        return count;
    }


    int getCount(String s, int i, int j) {

        int count = 0;

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {

            count++;

            i--;

            j++;

        }

        return count;
    }

    public static void main(String[] args) {

    }
}
