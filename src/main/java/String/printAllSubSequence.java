package String;

public class printAllSubSequence {

    static void printSubSequence(String s, String ans) {

        // this is question needs your peace, awareness and a lot of involvement
        // don't get confused
        // just remember the concept of pick and don't pick character

        if (s.length() == 0) {

            System.out.println("Result : " + ans);
            return;

        }

        // pick character
        System.out.println("1 -> " + "s : " + s  + ", ans : " + ans);

        printSubSequence(s.substring(1), ans + s.charAt(0));

        // don't pick character
        System.out.println("2 -> " + "s : " + s  + ", ans : " + ans);

        printSubSequence(s.substring(1), ans);

    }

    public static void main(String[] args) {

        // Time complexity - O(2^n)

        printSubSequence("abcd", "");

    }
}
