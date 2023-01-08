package String;

public class implementStrStr {

    public int strStr(String haystack, String needle) {

        int n1 = haystack.length(), n2 = needle.length();

        if (n1 < n2) {
            return -1;
        } else if (n2 == 0) {
            return 0;
        }

        int threshold = n1 - n2;

        for (int index = 0; index <= threshold; ++index) {

            if (haystack.substring(index, index + n2).equalsIgnoreCase(needle)) {

                return index;

            }

        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
