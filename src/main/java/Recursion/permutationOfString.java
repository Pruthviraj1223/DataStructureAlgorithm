package Recursion;

// Java program to print all permutations of a
// given string.
class Permutation {

    public void permute(String str, int left, int right) {

        // A B C
        // watch GFG tree for ABC , it might help you
        //https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/

        if (left == right) {

            System.out.println("ANS : " + str);

        } else {

            for (int index = left; index <= right; index++) {

                str = swap(str, left, index);                   // for swapping

//                System.out.println("step 1 : left " + left + " index " + index + " str " + str);

                permute(str, left + 1, right);

                str = swap(str, left, index);                   // for backtracking

//                System.out.println("step 2 : left " + left + " index " + index + " str " + str);

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

        // https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/

        String str = "ABC";

        int n = str.length();

        new Permutation().permute(str, 0, n - 1);

    }
}
