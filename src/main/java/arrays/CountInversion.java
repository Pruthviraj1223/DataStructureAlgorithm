package arrays;


import java.util.Arrays;

class MergeSortAlgorithm {

    public int merge(int[] nums, int low, int mid, int high) {

        int inversionCount = 0;

        int[] left = Arrays.copyOfRange(nums, low, mid + 1);  // low and mid +1 because if you give range 0 to 5 , it will copy elements only 0 to 4

        int[] right = Arrays.copyOfRange(nums, mid + 1, high + 1);

        int i = 0;

        int j = 0;

        int k = low;

        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) {

                nums[k++] = left[i++];

            } else {

                inversionCount += (mid + 1) - (low + i);

                nums[k++] = right[j++];

            }

        }


        while (i < left.length) {

            nums[k++] = left[i++];

        }

        while (j < right.length) {

            nums[k++] = right[j++];

        }

        return inversionCount;

    }

    public int mergeSort(int[] nums, int low, int high) {

        int inversionCount = 0;

        if (low < high) {

            int mid = low + (high - low) / 2;

            inversionCount += mergeSort(nums, low, mid);

            inversionCount += mergeSort(nums, mid + 1, high);

            inversionCount += merge(nums, low, mid, high);

        }

        return inversionCount;

    }

}

public class CountInversion {

    public static void main(String[] args) {

        //https://www.geeksforgeeks.org/inversion-count-in-array-using-merge-sort/

        new MergeSortAlgorithm().mergeSort(new int[]{8, 4, 2, 1}, 0, 3);

    }
}
