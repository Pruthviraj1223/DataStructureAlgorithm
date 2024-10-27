package arrays.slidingWindow;

import java.util.Deque;
import java.util.LinkedList;

class Solution1908 {
    public int[] maxSlidingWindow(int[] nums, int k) {

        LinkedList<Integer> result = new LinkedList<>();

        int n = nums.length;

        Deque<Integer> queue = new LinkedList<>();

        int index;

        for (index = 0; index < k; ++index) {

            while ((!queue.isEmpty()) && nums[index] >= nums[queue.peekLast()]) {

                queue.removeLast();

            }

            queue.addLast(index);

        }

        // Most IMP : queue will be always in descending order while finding the maximum int array

        for (; index < n; ++index) {

            if (!queue.isEmpty()){

                result.add(nums[queue.peek()]);

            }

            while ((!queue.isEmpty()) && queue.peek() <= index - k) {

                queue.removeFirst();

            }

            while ((!queue.isEmpty()) && nums[index] >= nums[queue.peekLast()]) {

                queue.removeLast();

            }

            queue.addLast(index);

        }

        if (!queue.isEmpty()){

            result.add(nums[queue.peek()]);

        }

        // below code is to convert object array (list) to int array

        Object[] objectArray = result.toArray();

        int[] intArr = new int[objectArray.length];

        for (int position = 0; position < objectArray.length; position++) {

            intArr[position] = (Integer) objectArray[position];
        }

        return intArr;

    }
}

public class SlidingWindowsMaximum {

    public static void main(String[] args) {

        new Solution1908().maxSlidingWindow(new int[]{7, 2, 4}, 2);

        // MUST watch sumOfMinimumAndMaximumOfWindowKSize in queue folder.

        // https://leetcode.com/problems/sliding-window-maximum/

        // we can also use heap. a bit more efficient

    }
}
