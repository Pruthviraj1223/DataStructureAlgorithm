package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

class maxHeapComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
        return b[0] * b[0] + b[1] * b[1] - a[0] * a[0] - a[1] * a[1];   // b-a means descending
    }

}

public class kClosestPointOrigin {

    public static int[][] closePoint(int[][] nums, int k) {

        PriorityQueue<int[]> maxheap = new PriorityQueue<>(new maxHeapComparator());

        for (int index = 0; index < nums.length; index++) {

            maxheap.add(nums[index]);

            if (maxheap.size() > k) {

                maxheap.poll();             // maximum distance point will be on top and it will be removed

            }

        }

        // at then end we will have only k int[] in maxHeap.

        int[][] res = new int[k][2];

        while (k > 0) {

            var item = maxheap.poll();

            res[--k] = item;

        }

        return res;

    }

    public static void main(String[] args) {

        int[][] points = {{1, 3},
                {2, 3}};

        int K = 2;

        closePoint(points, K);

    }
}
