package String;

public class splitBinaryStringOf0and1 {

    static int maxSubStr(String str, int n) {

        int count0 = 0, count1 = 0;

        int answer = 0;

        for (int index = 0; index < n; index++) {

            if (str.charAt(index) == '0') {

                count0++;

            } else {

                count1++;

            }

            if (count0 == count1) {

                answer++;

            }
        }

        if (count0 != count1) {

            return -1;

        }

        return answer;
    }

    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/split-the-binary-string-into-substrings-with-equal-number-of-0s-and-1s/

    }
}
