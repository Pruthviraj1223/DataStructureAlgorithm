package BinarySearch;

class nextElement {
    public char nextGreatestLetter(char[] nums, char key) {

/*
* Similar to ceil
* Aditya verma
*
* */


        int len = nums.length;
        int low = 0;
        int high = len - 1;


        char ans = '0';

        while (low <= high) {


            int mid = low + (high - low) / 2;


            if (nums[mid] == key) {


                low = mid +1;

            } else if (nums[mid] < key) {

                low = mid + 1;


            } else {

                ans = nums[mid];

                high = mid - 1;


            }

        }

        if (ans=='0'){

            return nums[0];

        }

        return ans;

    }
}

public class nextAlphabeticEelement {
    public static void main(String[] args) {

    }
}
