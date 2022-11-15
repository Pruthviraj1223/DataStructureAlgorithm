package string;

public class splitBinaryStringOf0and1 {

    static int maxSubStr(String str, int n) {

        int count0 = 0, count1 = 0;

        int cnt = 0;

        for (int index = 0; index < n; index++) {

            if (str.charAt(index) == '0') {

                count0++;

            } else {

                count1++;

            }

            if (count0 == count1) {

                cnt++;

            }
        }

        if (count0 != count1) {

            return -1;

        }

        return cnt;
    }

    public static void main(String[] args) {

    }
}
