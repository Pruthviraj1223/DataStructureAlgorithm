package Arrays;

public class RverseArray {
    public static void main(String[] args) {


        // the same way you can reverse string as well

        int []arr= new int[]{1, 4, 2, 8, 9};

        int start = 0;

        int end = arr.length - 1;

        while (start<end){

            int temp = arr[start];

            arr[start] = arr[end];

            arr[end] = temp;

            start++;

            end--;

        }

        System.out.println();
        for (int j : arr) {
            System.out.print(j + " ");
        }


    }
}
