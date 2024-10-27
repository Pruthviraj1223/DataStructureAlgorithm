package arrays;


class productOfArray {

    int[] product(int[] nums) {

        // MUST understand two approaches
        // tech dose

        int[] left = new int[nums.length];

        int[] right = new int[nums.length];

        int n = nums.length;

        left[0] = nums[0];

        right[n - 1] = nums[n - 1];

        for (int index = 1; index <= nums.length - 1; index++) {

            left[index] = nums[index] * left[index - 1];

        }

        for (int index = n - 2; index >= 0; index--) {

            right[index] = nums[index] * right[index + 1];

        }

        int[] result = new int[left.length];

        for (int index = 1; index < left.length - 1; index++) {

            result[index] = left[index - 1] * right[index + 1];

        }

        // result[index] = left[index - 1] * right[index + 1]; same formula applies below
        // but at 0 position you cant do left[index-1] and same for last position

        result[0] = right[1];

        result[left.length - 1] = left[left.length - 2];

        return result;
    }

    int[] productMoreEfficient(int []nums){

        int[] left = new int[nums.length];

        int n = nums.length;

        left[0] = nums[0];

        for (int index = 1; index <= nums.length - 1; index++) {

            left[index] = nums[index] * left[index - 1];

        }

        int prod = 1; // instead of using right array use prod variable

        // from back of the array it will get started to multiply with current element
        // prod will maintain the multiplication of all element in right side , so we don't need right array
        // so instead of left[index - 1] * right[index + 1] in above solution
        // we can do left[index - 1] * prod

        for (int index = n - 1; index > 0; index--) {

            left[index] = left[index - 1] * prod;

            prod = prod * nums[index];

        }

        left[0] = prod;

        return left;
    }
}

public class productArrayExceptSelf {

    public static void main(String[] args) {

        int[] n = {1, 2, 3, 4};

        new productOfArray().product(n);

        //https://leetcode.com/problems/product-of-array-except-self/

    }
}
