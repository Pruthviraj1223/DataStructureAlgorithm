package arrays;

import java.util.Arrays;

public class KthLargestSmallestInArray {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 54, 2, 78, 11};

        int k = 2;

        int n = arr.length;

        Arrays.sort(arr);

        System.out.println(arr[n - k]);  // kth largest

        System.out.println(arr[k-1]);    // kth smallest

    }
}
