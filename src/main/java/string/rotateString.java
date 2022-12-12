package string;

public class rotateString {

    public boolean rotateStrings(String A, String B) {

        // Leetcode solution

        if (A == null || B == null) {
            //throw exception on A and B both being null?
            return false;
        }

        if (A.length() != B.length()) {
            return false;
        }

        if (A.length() == 0) {
            return true;
        }

        for (int index = 0; index < A.length(); index++) {

            if (checkIfRotated(A, B, index)) {

                return true;

            }
        }
        return false;
    }

    private boolean checkIfRotated(String A, String B, int rotation) {

        for (int index = 0; index < A.length(); index++) {

            if (A.charAt(index) != B.charAt((index + rotation) % B.length())) {

                return false;

            }
        }

        return true;

    }

    boolean rotate(String a, String b) {

        return a.length() == b.length() && (a + a).contains(b);

        // O(N^2)

        // GFG has its own approach , queue approach is good

        // kmp will come in picture

    }


    public static void main(String[] args) {

        // Also watch out checkIfStringIsRotatedByTwoPlaces.

        //https://leetcode.com/problems/rotate-string/

        // if you want to know how place rotation the second string have , we can also get

    }
}
