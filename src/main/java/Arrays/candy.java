package Arrays;

import java.util.Arrays;

class Candy{
    public int candy1(int[] ratings) {

        int sum = 0;

        int[] left2right = new int[ratings.length];

        int[] right2left = new int[ratings.length];

        Arrays.fill(left2right, 1);

        Arrays.fill(right2left, 1);

        for (int index = 1; index < ratings.length; index++) {

            if (ratings[index] > ratings[index - 1]) {

                left2right[index] = left2right[index - 1] + 1;

            }

        }

        for (int index = ratings.length - 2; index >= 0; index--) {

            if (ratings[index] > ratings[index + 1]) {

                right2left[index] = right2left[index + 1] + 1;

            }
        }

        for (int index = 0; index < ratings.length; index++) {

            sum += Math.max(left2right[index], right2left[index]);                  // must understand wh we are talking max? // ex : 3 , _ , 7

        }

        return sum;
    }

    // optimized

    public int candy2(int[] ratings) {

        int[] candies = new int[ratings.length];

        Arrays.fill(candies, 1);

        for (int index = 1; index < ratings.length; index++) {

            if (ratings[index] > ratings[index - 1]) {

                candies[index] = candies[index - 1] + 1;

            }
        }

        // we are not talking extra array for traversing from right to left
        // we can do with one array

        int sum = candies[ratings.length - 1];

        for (int index = ratings.length - 2; index >= 0; index--) {

            if (ratings[index] > ratings[index + 1]) {

                candies[index] = Math.max(candies[index], candies[index + 1] + 1);

            }

            sum += candies[index];

        }

        return sum;

    }
}

public class candy {
    public static void main(String[] args) {

        new Candy().candy1(new int[]{1,5,2,1,5});

        //https://leetcode.com/problems/candy/

    }
}
