package String;

public class checkShuffledString {

    boolean compare(int[] count1, int[] count2) {

        for (int index = 0; index < 256; index++) {

            if (count1[index] != count2[index]) {
                return false;
            }

        }
        return true;
    }

    boolean check(String s1, String s2) {

        // check for first window of len1 and make count1 and count2
        // then increase count for character from s2  and decrease the count of index-len1 (out of window)

        int len1 = s1.length();
        int len2 = s2.length();

        int[] count1 = new int[256];
        int[] count2 = new int[256];

        int index;

        for (index = 0; index < len1; index++) {

            count1[s1.charAt(index) - 'a']++;

            count2[s2.charAt(index) - 'a']++;

        }

        for (; index < len2; index++) {

            if (compare(count1, count2)) {
                return true;
            }

            count2[s2.charAt(index) - 'a']++;

            count2[s2.charAt(index - len1) - 'a']--;

        }

        if (compare(count1,count2)){            // check for last window

            return true;

        }

        return false;

    }

    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/check-if-the-given-string-is-shuffled-substring-of-another-string/
    }
}
