package arrays;

import java.util.Arrays;

class MergeSortAlgoritham {

    public int merge(int[] nums, int low, int mid, int high) {

        int inversionCount = 0;

        int middle = mid + 1;

        for (int i = low; i <= mid; i++) {

            while (middle <= high && nums[i] > nums[middle] * 2) {

                middle++;

            }

            inversionCount += middle - (mid + 1);

        }

        int[] left = Arrays.copyOfRange(nums, low, mid + 1);  // low and mid +1 because if you give range 0 to 5 , it will copy elements only 0 to 4

        int[] right = Arrays.copyOfRange(nums, mid + 1, high + 1);

        int i = 0;

        int j = 0;

        int k = low;

        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) {

                nums[k++] = left[i++];

            } else {

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


public class ReversePairs {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 2, 3, 1};

        System.out.println(new MergeSortAlgoritham().mergeSort(nums, 0, nums.length - 1));

    }
}
