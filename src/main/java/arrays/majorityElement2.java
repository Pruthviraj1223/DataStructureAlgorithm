package arrays;

import java.util.ArrayList;
import java.util.List;

public class majorityElement2 {

    static List<Integer> majority(int[] nums) {

        List<Integer> result = new ArrayList<>();

        int count1 = 0, count2 = 0;

        int number1 = nums[0], number2 = nums[0];

        for (int num : nums) {

            if (num == number1) {

                count1++;

            } else if (num == number2) {

                count2++;

            } else if (count1 == 0) {

                number1 = num;
                count1 = 1;

            } else if (count2 == 0) {

                number2 = num;
                count2 = 1;

            } else {

                count1--;
                count2--;

            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {

            if (num == number1) {
                count1++;

            } else if (num == number2) {
                count2++;
            }
        }

        if (count1 > nums.length / 3) {

            result.add(number1);

        }
        if (count2 > nums.length / 3) {

            result.add(number2);

        }

        return result;

    }


    public static void main(String[] args) {

        // https://leetcode.com/problems/majority-element-ii/submissions/866442554/

    }
}
