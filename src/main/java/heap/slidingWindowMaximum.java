package heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class slidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {

        List<Integer> ans = new ArrayList<>();

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int index = 0; index < nums.length; index++) {

            while (maxHeap.size() > 0 && maxHeap.peek()[1] <= index - k) {

                maxHeap.poll();

            }

            maxHeap.add(new int[]{nums[index], index});

            if (index >= k - 1 && maxHeap.size() > 0) {     // just for first window

                ans.add(maxHeap.peek()[0]);

            }

        }

        return ans.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }

    public static void main(String[] args) {

    }
}
