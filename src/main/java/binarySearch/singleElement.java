package binarySearch;

class single {

    public int singleEle(int[] nums, int low, int high) {

        if (low == high) {
            return nums[low];

        }

        int mid = (low + high) / 2;

        if (mid % 2 == 1) {

            if (nums[mid] == nums[mid - 1]) {

                return singleEle(nums, mid + 1, high);

            } else {

                return singleEle(nums, low, mid - 1);

            }

        } else {


            if (nums[mid] == nums[mid + 1]) {

                return singleEle(nums, mid + 2, high);

            } else {

                return singleEle(nums, low, mid);

            }

        }

    }

    public int singleEleDuplicate(int[] nums) {

        int start = 0, end = nums.length - 1, mid;

        if (nums.length == 1) // If only one element is in the array
            return nums[0];

        if (nums[start]  != nums[start + 1]) // If the first element
            return nums[start];

        if (nums[end] != nums[end- 1]) // If Last element is the element
            return nums[end];

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] != nums[mid - 1]  && nums[mid] != nums[mid + 1])
                return nums[mid];

                // CASE 2 and CASE 3

            else if ((nums[mid] == nums[mid + 1] && mid % 2 == 0)
                    || (nums[mid] == nums[mid - 1] && mid % 2 != 0))
                start = mid + 1;
                // CASE 4 and CASE 5

            else
                end = mid - 1;

        }

        return -1;

    }

}

public class singleElement {

    public static void main(String[] args) {

    }
}
