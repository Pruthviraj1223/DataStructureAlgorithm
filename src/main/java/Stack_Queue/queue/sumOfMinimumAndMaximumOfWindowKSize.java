package Stack_Queue.queue;

import java.util.Deque;
import java.util.LinkedList;

class sum {

    public void sumOfMinMax(int[] nums, int k) {

        Deque<Integer> min = new LinkedList<>();    // it will be in increasing order , peek ele would be the smallest

        Deque<Integer> max = new LinkedList<>();    // it will be in decreasing order , peek ele would be the maximum

        int index;
        int sum = 0;

        for (index = 0; index < k; index++) {

            int currentEle = nums[index];

            while (!min.isEmpty() && nums[min.peekLast()] >= currentEle) {

                min.removeLast();

            }

            while (!max.isEmpty() && nums[max.peekLast()] <= currentEle) {

                max.removeLast();

            }

            min.addLast(index);

            max.addLast(index);

        }

        for (; index < nums.length && !min.isEmpty() && !max.isEmpty(); index++) {

            sum += nums[min.peek()] + nums[max.peek()];

            int currentEle = nums[index];

            while (!min.isEmpty() && min.peek() <= index - k) {

                min.removeFirst();

            }

            while (!max.isEmpty() && max.peek() <= index - k) {

                max.removeFirst();

            }

            while (!min.isEmpty() && nums[min.peek()] >= currentEle) {

                min.removeLast();

            }

            while (!max.isEmpty() && nums[max.peek()] <= currentEle) {

                max.removeLast();

            }

            min.addLast(index);

            max.addLast(index);

        }

        if (!min.isEmpty() && !max.isEmpty()) {

            sum += nums[min.peek()] + nums[max.peek()];

        }

        System.out.println(sum);

    }


}

public class sumOfMinimumAndMaximumOfWindowKSize {
    public static void main(String[] args) {

        new sum().sumOfMinMax(new int[]{2, 5, -1, 7, -3, -1, -2}, 3);

    }
}
