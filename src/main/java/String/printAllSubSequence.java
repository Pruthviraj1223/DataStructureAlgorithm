package String;

public class printAllSubSequence {

    static void print(String s, String ans) {

        if (s.length() == 0) {

            System.out.println(ans);
            return;

        }


        print(s.substring(1), ans + s.charAt(0));


        print(s.substring(1), ans);

    }


    public static void main(String[] args) {

        // Time complexity - O(2^n)

        print("abcd", "");


    }
}
