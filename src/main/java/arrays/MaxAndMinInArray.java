package arrays;

public class MaxAndMinInArray {

    public static void main(String[] args) {

        int[] nums = new int[]{3, 54, 2, 78, 11};

//        Arrays.sort(nums);         // you can sort the array like this
//
//        for(int a:nums){
//            System.out.println(a);
//        }

        int min = nums[0];

        int max = nums[0];

        for (int num : nums) {

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }

        }
    }
}
