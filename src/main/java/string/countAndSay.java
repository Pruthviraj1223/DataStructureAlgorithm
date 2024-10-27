package string;

public class countAndSay {
    public static String countAndSay(int n) {

        String s = "1";

        for (int index = 1; index < n; index++) {

            System.out.println(s);

            s = countIndex(s);

        }

        return s;

    }

    public static String countIndex(String s) {

        int index = 0;
        int count;

        StringBuilder result = new StringBuilder();

        while (index < s.length()) {

            count = 0;

            char ch = s.charAt(index);

            while (index < s.length() && ch == s.charAt(index)) {

                count++;
                index++;

            }

            result.append(count);       // first append the count of character

            result.append(ch);          // then append the character

        }

        return result.toString();

    }

    public static void main(String[] args) {

        countAndSay(4);

        // https://leetcode.com/problems/count-and-say/
        // ex : 1211

    }

}
