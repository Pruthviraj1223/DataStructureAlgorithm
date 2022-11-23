package heap;

import java.util.Arrays;

public class heapifyArray {

    static void heapify(int[] arr, int index) {

        // you give index, and it will heapify all the children of it recursively.
        // but only its children or subtree, not other children or subtree

        if (index >= arr.length) {
            return;
        }

        int n = arr.length;

        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != index) {

            swap(arr, largest, index);

            heapify(arr, largest);

        }


    }

    private static void swap(int[] arr, int largest, int index) {

        int temp = arr[largest];
        arr[largest] = arr[index];
        arr[index] = temp;

    }

    public static void main(String[] args) {

        int[] arr = {16, 11, 18, 5, 13,17};

        heapify(arr,1);

        System.out.println(Arrays.toString(arr));

    }
}