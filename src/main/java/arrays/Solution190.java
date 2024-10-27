package arrays;

import java.util.Arrays;

public class Solution190 {


    // candy Leetcode

    public int candy1(int[] ratings) {
        int sum = 0;

        int[] left2right = new int[ratings.length];

        int[] right2left = new int[ratings.length];

        Arrays.fill(left2right, 1);

        Arrays.fill(right2left, 1);

        for (int i = 1; i < ratings.length; i++) {

            if (ratings[i] > ratings[i - 1]) {

                left2right[i] = left2right[i - 1] + 1;

            }

        }

        for (int i = ratings.length - 2; i >= 0; i--) {

           if (ratings[i] > ratings[i + 1]) {

            right2left[i] = right2left[i + 1] + 1;

            }
        }

        for (int i = 0; i < ratings.length; i++) {

            sum += Math.max(left2right[i], right2left[i]);

        }

        return sum;
    }

    // optimized

    public int candy2(int[] ratings) {

        int[] candies = new int[ratings.length];

        Arrays.fill(candies, 1);

        for (int i = 1; i < ratings.length; i++) {

            if (ratings[i] > ratings[i - 1]) {

                candies[i] = candies[i - 1] + 1;

            }
        }

        int sum = candies[ratings.length - 1];

        for (int i = ratings.length - 2; i >= 0; i--) {

            if (ratings[i] > ratings[i + 1]) {

                candies[i] = Math.max(candies[i], candies[i + 1] + 1);

            }

            sum += candies[i];

        }

        return sum;

    }

    //


}
