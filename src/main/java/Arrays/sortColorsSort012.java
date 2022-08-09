package Arrays;

public class sortColorsSort012 {


    public static void main(String[] args) {


        // sort colors
        // sort 0 , 1 , 2
        // dutch national flag

        int[] nums = new int[]{1, 2};// it will be given


        int low = 0;
        int mid = 0;
        int high = nums.length - 1;


        while (mid <= high) {


            if (nums[mid] == 0) {


                int temp = nums[low];

                nums[low] = nums[mid];

                nums[mid] = temp;


                low++;

                mid++;


            } else if (nums[mid] == 2) {


                int temp = nums[high];

                nums[high] = nums[mid];

                nums[mid] = temp;


                high--;


            } else {


                mid++;


            }


        }


    }


}
