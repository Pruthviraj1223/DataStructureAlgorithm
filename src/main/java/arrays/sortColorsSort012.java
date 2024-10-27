package arrays;

public class sortColorsSort012 {

    public static void main(String[] args) {

        // good question

        // sort colors
        // sort 0 , 1 , 2
        // Dutch national flag

        // [2,0,2,1,1,0]
        // 0 0 2 1 1 2

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

                mid++;                                   // the reason for mid++ : when low == mid then low gets ++ and mid has to be ++. For ex : initially low and mid 0
                                                         // another reason for mid ++ : once you swap , element at mid will be always 1.
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
