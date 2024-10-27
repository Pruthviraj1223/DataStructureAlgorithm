package arrays;

import java.util.Arrays;

public class LargestNumberformedfromanArray {

    static String printLargest(String[] arr) {

        Arrays.sort(arr, (x, y) -> {

            String xy = x + y;

            String yx = y + x;

            return yx.compareTo(xy);

        });

        StringBuilder ans = new StringBuilder();

        for (String s : arr) ans.append(s);

        return ans.toString();
    }

    public static void main(String[] args) {

        printLargest(new String[]{"3", "30", "34", "5", "9"});

    }
}
