package Arrays;

class solution6 {

    int majorityElement(int[] nums) {

        // we can sort and then check
        // we can use map and store the count

        int count = 0;

        int majorityElement = -1;

        for (int num : nums) {

            if (count == 0) {

                majorityElement = num;

            }

            if (num == majorityElement) {

                count += 1;

            } else {

                count -= 1;

            }

        }

        return majorityElement;

    }
}

public class majorityElement1 {

    public static void main(String[] args) {

        //https://leetcode.com/problems/majority-element/

    }
}
