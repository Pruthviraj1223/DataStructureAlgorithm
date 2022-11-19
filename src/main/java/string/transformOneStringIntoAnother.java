package string;

public class transformOneStringIntoAnother {

    public static int minOps(String A, String B) {

        if (A.length() != B.length())
            return -1;

        int i, j, operations = 0;

        int[] count = new int[256];

        for (i = 0; i < A.length(); i++) {

            count[A.charAt(i)]++;
            count[B.charAt(i)]--;

        }

        // if it all zero means a and B having same frequency of characters

        for (i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return -1;
            }
        }


        i = A.length() - 1;

        j = B.length() - 1;

        while (i >= 0) {

            if (A.charAt(i) != B.charAt(j)) {

                operations++;

            } else {

                j--;

            }

            i--;
        }

        return operations;
    }

    public static void main(String[] args) {

    }
}
