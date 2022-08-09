package Arrays;

import java.util.Arrays;

class Solution123 {
    public int smallestRangeII(int[] A, int K) {

        int N = A.length;

        Arrays.sort(A);

        int ans = A[N-1] - A[0];

        for (int i = 0; i < A.length - 1; ++i) {

            int a = A[i], b = A[i];

            if (b - K < 0){
                continue;
            }

            int high = Math.max(A[N-1] - K, a + K);

            int low = Math.min(A[0] + K, b - K);

            ans = Math.min(ans, high - low);

        }

        System.out.println(ans);

        return ans;
    }
}
public class minimizeTheMaximumDifferenceBetweenHeights {

    public static void main(String[] args) {

        int []nums = new int[]{1,5,10,15};

        new Solution123().smallestRangeII(nums,3);
    }


}
