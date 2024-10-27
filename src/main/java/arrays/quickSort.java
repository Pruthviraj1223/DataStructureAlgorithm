package arrays;

class sort {


    void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = (low - 1);

        for (int index = low; index <= high - 1; index++) {

            if (arr[index] < pivot) {

                i++;

                swap(arr, i, index);

            }

        }


        swap(arr, i + 1, high);

        return i + 1;
    }

    public void quickSort(int[] arr, int low, int high) {

        // 10 3 15 2 7 1 11 17 5
        // 3 10 15 2 7 1 11 17 5
        // 3 2 15 10 7 1 11 17 5
        // 3 2 1 10 7 15 11 17 5
        // 3 2 1 5 7 15 11 17 10

        int pivot;

        if (low < high) {

            pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);


        }


    }
}

public class quickSort {
    public static void main(String[] args) {

        int []arr = new int[]{10,3,15,2,7,1,11,17,5};

        new sort().quickSort(arr,0,arr.length-1);

        System.out.println();

    }
}
