package Arrays;

class SubarrayWithGrterValue {
    public int minSubArrayLen(int x, int[] arr) {

        // GFG and  Leet code
        // Lett code soltuion is more optimized

        if (arr.length==0 || arr==null){

            return 0;

        }

        int n = arr.length;

        int curr_sum = 0, min_len = Integer.MAX_VALUE;

        int start = 0, end = 0;
        while (end < n) {
            curr_sum += arr[end++];

            while (curr_sum >=x) {


                min_len = Math.min(min_len,end - start);

                // remove starting elements
                curr_sum -= arr[start++];
            }
        }


        return (min_len != Integer.MAX_VALUE) ? min_len : 0;


    }
}

public class subarrayWithGreaterValue {
    public static void main(String[] args) {

    }
}