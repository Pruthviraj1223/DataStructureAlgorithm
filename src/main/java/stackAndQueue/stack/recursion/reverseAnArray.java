package stackAndQueue.stack.recursion;

class ReverseArr {
    int[] arr = new int[5];

    void swap(int i, int j) {

        int temp = arr[i];

        arr[i] = arr[j];

        arr[j] = temp;

    }

    void reverseArray(int i, int j) {

        if (i == j) {

            return;

        }

        swap(i, j);

        i++;

        j--;

        reverseArray(i, j);


    }
}

public class reverseAnArray {
    public static void main(String[] args) {

        ReverseArr reverseArr = new ReverseArr();
        reverseArr.arr[0] = 1;
        reverseArr.arr[1] = 2;
        reverseArr.arr[2] = 3;
        reverseArr.arr[3] = 4;
        reverseArr.arr[4] = 5;

        reverseArr.reverseArray(0, 4);

    }
}
