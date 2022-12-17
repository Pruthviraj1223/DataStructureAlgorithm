package String;

public class transformOneStringIntoAnother {

    public static int minimumOperations(String s1, String s2) {

        if (s1.length() != s2.length())
            return -1;

        int index, operations = 0;

        int[] count = new int[256];

        for (index = 0; index < s1.length(); index++) {

            count[s1.charAt(index)]++;

            count[s2.charAt(index)]--;

        }

        // if it all zero means a and B having same frequency of characters

        for (index = 0; index < 256; index++) {

            if (count[index] != 0) {

                return -1;

            }
        }

        int index1 = s1.length() - 1;

        int index2 = s2.length() - 1;

        while (index1 >= 0) {

            if (s1.charAt(index1) != s2.charAt(index2)) {

                operations++;

            } else {

                index2--;

            }

            index1--;
        }

        return operations;
    }

    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/transform-one-string-to-another-using-minimum-number-of-given-operation/

    }
}
