package heap;

import java.util.Arrays;

public class heapsort {

    static void heapSort(int[] arr) {

        int n = arr.length;

        buildHeap.buildMaxHeap(arr);

        for (int index = n - 1; index >= 0; index--) {

            util.swap(arr, 0, index);

            heapifyArray.heapify(arr, index, 0);        // here index is reduced heap size. because we are adding maximum element into end, so we have to reduce size.

        }

    }


    public static void main(String[] args) {

        int[] arr = {16, 11, 18, 5, 13, 17};

        heapSort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
