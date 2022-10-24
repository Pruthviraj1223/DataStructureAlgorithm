package Arrays;

import java.util.Arrays;

class mergeArrays {


    public void merge(int[] arr, int left, int mid, int right) {

        int[] Left = Arrays.copyOfRange(arr, left, mid + 1);

        int[] Right = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < Left.length && j < Right.length) {

            if (Left[i] < Right[j]) {

                arr[k++] = Left[i++];

            } else {

                arr[k++] = Right[j++];

            }
        }

        for (; i < Left.length; i++) {

            arr[k++] = Left[i];

        }


        for (; j < Right.length; j++) {

            arr[k++] = Right[j];

        }



    }


    public void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);

            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);

        }


    }


}


public class mergeSort {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 5, 1, 6, 4, 8, 9, 3};

        new mergeArrays().mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }
}
