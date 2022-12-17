package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class lastStoneWeight {

    public static int lastStoneWeight(int[] nums) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {

            maxHeap.add(num);
        }

        while (maxHeap.size() > 1) {

            var first = maxHeap.poll();
            var second = maxHeap.poll();

            if (first - second > 0) {

                maxHeap.add(first - second);

            }
        }

        if (!maxHeap.isEmpty()) {
            return maxHeap.peek();
        }

        return 0;
    }

    public static void main(String[] args) {

    }
}
