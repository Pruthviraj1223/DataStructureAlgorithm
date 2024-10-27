package arrays.slidingWindow;

import java.util.LinkedList;
import java.util.Queue;

class Negative {

    public void NegativeEleSizeK(int[] nums, int k) {

        Queue<Integer> queue = new LinkedList<>();

        int n = nums.length;

        int index = 0;

        for (; index < k; index++) {

            if (nums[index] < 0) {

                queue.add(index);

            }

        }

        int j = 0;

        for (; index < n; index++, j++) {

            if (queue.isEmpty()) {

                System.out.println("ans " + "None");

            } else {

                System.out.println("ans - " + nums[queue.peek()]);

            }

            while (!queue.isEmpty() && queue.peek() <= index - k) {

                queue.poll();

            }

            if (nums[index] < 0) {

                queue.add(index);

            }

        }

        if (queue.isEmpty()) {

            System.out.println("0");

        } else {

            System.out.println("ans -- " + nums[queue.peek()]);

        }

    }

}


public class FirstNegativeElementOfWindowSizeK {
    public static void main(String[] args) {

        new Negative().NegativeEleSizeK(new int[]{12, -1, -7, 8, -15, 30, 16, 28}, 3);

        //https://www.geeksforgeeks.org/first-negative-integer-every-window-size-k/

    }
}
