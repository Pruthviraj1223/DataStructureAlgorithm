package Heap;

public class util {
    public static void swap(int[] arr, int largest, int index) {

        int temp = arr[largest];
        arr[largest] = arr[index];
        arr[index] = temp;

    }
}
