package heap;

import java.util.Arrays;

public class minimumSum {
    int solve(int []arr){

        Arrays.sort(arr);

        int a = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 != 0)
                a = a * 10 + arr[i];
            else
                b = b * 10 + arr[i];
        }

        // return the sum
        return a + b;
    }

    // you can use min heap as well.
}
