package recursion;

class Permutation {

    public void permute(String str, int left, int right) {

        // recursion tree is important

        if (left == right) {                                // base condition

            System.out.println("ANS : " + str);

        } else {

            for (int index = left; index <= right; index++) {

                str = swap(str, left, index);

                permute(str, left + 1, right);

                str = swap(str, left, index);                   // for backtracking

            }
        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}


public class permutationOfString {
    public static void main(String[] args) {

        // watch GFG tree for ABC , it might help you

        // https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/

        String str = "ABC";

        new Permutation().permute(str, 0, str.length() - 1);

    }
}
