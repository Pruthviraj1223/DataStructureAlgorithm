package Heap;

import java.util.Arrays;

public class buildHeap {

    static void buildMaxHeap(int[] arr) {

        int n = arr.length;

        for (int index = n / 2 - 1; index >= 0; index--) {

            heapifyArray.heapify(arr,n, index);

        }

    }

    public static void main(String[] args) {

        int[] arr = {16, 11, 18, 5, 13, 17};

        buildMaxHeap(arr);

        System.out.println(Arrays.toString(arr));

    }
}
