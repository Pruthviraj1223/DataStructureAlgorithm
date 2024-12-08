package heap;

import java.util.PriorityQueue;

public class KthLargestSumContiguousSubarray {

    static Integer LargestSum(int[] nums, int k) {

        // GFG Approach

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int[] sum = new int[nums.length + 1];

        sum[0] = 0;

        //(20, 15, 14, -5, -6, -1)
        // 0, 20, 35 , 49 , 44 , 38 , 37

        for (int index = 1; index <= nums.length; index++) {

            sum[index] = sum[index - 1] + nums[index - 1];

        }

        for (int outer = 1; outer <= nums.length; outer++) {

            for (int inner = outer; inner <= nums.length; inner++) {

                int ele = sum[inner] - sum[outer -1];       // to not include zero

                if (minHeap.size() < k) {

                    minHeap.add(ele);

                } else {

                    if (!minHeap.isEmpty() && minHeap.peek() < ele) {

                        minHeap.poll();

                        minHeap.add(ele);

                    }

                }

            }
        }

        return minHeap.poll();


    }


    public static void main(String[] args) {

        var arr = new int[]{10, -10, 20, -40};

        System.out.println(LargestSum(arr,6));

    }
}
