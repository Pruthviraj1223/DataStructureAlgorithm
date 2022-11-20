package string;

public class grumpyBookstoreOwner {

    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int satisfied = 0;

        // first we'll check customer are happy when owner is not grumpy
        // without secret technique

        for (int index = 0; index < customers.length; index++) {

            if (grumpy[index] == 0) {

                satisfied += customers[index];

            }
        }

        int maxSum = 0;
        int currSum = 0;
        int left = 0;

        // now we'll check for windows(minutes) using secret technique
        // it's simple you add from right and subtract from left
        // additional condition is only is that , owner must be grumpy

        for (int right = 0; right < customers.length; right++) {

            if (grumpy[right] == 1) {

                currSum += customers[right];

            }

            if (right - left + 1 >= minutes) {

                maxSum = Math.max(maxSum, currSum);

                if (grumpy[left] == 1) {

                    currSum -= customers[left];

                }

                left++;
            }
        }

        return satisfied + maxSum;
    }

    public static void main(String[] args) {

    }
}
