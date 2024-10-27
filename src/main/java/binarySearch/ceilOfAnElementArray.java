package binarySearch;

class CeilOfAnElement {

    public int ceil(int[] nums, int key) {


        int len = nums.length;
        int low = 0;
        int high = len - 1;


        int ans = -1;

        while (low <= high) {


            int mid = low + (high - low) / 2;


            if (nums[mid] == key) {

                System.out.println("ans " + nums[mid]);

                return nums[mid];

            } else if (nums[mid] > key) {

                ans = nums[mid];

                high = mid - 1;

            } else {

                low = mid + 1;


            }

        }

        System.out.println("ans " + ans);

        return ans;

    }

}

public class ceilOfAnElementArray {
    public static void main(String[] args) {

        int ans = new CeilOfAnElement().ceil(new int[]{1, 2, 8, 10, 10, 12, 19}, 8);

    }
}
