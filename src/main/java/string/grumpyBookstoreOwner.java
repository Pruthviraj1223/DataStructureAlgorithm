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

        int maxCustomer = 0;
        int currCustomer = 0;
        int left = 0;

        // now we'll check for windows(minutes) using secret technique
        // it's simple you add from right and subtract from left
        // additional condition is only is that , owner must be grumpy

        // NOTE : below code is just sliding window problem only added condition is owner must be grumpy

        for (int right = 0; right < customers.length; right++) {

            if (grumpy[right] == 1) {

                currCustomer += customers[right];

            }

            if (right - left + 1 >= minutes) {                          /// this is for the first window

                maxCustomer = Math.max(maxCustomer, currCustomer);

                if (grumpy[left] == 1) {

                    currCustomer -= customers[left];

                }

                left++;
            }
        }

        return satisfied + maxCustomer;
    }

    public static void main(String[] args) {

        // https://leetcode.com/problems/grumpy-bookstore-owner/

        //            Input: customers = [1,0,1,2,1,1,7,5],
        //                      grumpy = [0,1,0,1,0,1,0,1], minutes = 3

    }
}
