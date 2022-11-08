package string;

public class countAndSay {

    public String countAndSay(int n) {

        String s = "1";

        for (int index = 1; index < n; index++) {

            System.out.println(s);

            s = countIndex(s);

        }

        return s;

    }

    public String countIndex(String s) {

        int index = 0;
        int count;

        StringBuilder sb = new StringBuilder();

        while (index < s.length()) {

            count = 0;

            char ch = s.charAt(index);

            while (index < s.length() && ch == s.charAt(index)) {

                count++;
                index++;

            }

            sb.append(count);
            sb.append(ch);

        }

        return sb.toString();

    }

}
