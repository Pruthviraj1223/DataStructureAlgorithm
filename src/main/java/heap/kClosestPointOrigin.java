package heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class minHeapComparator implements Comparator<int[]> {

    @Override
    public int compare(int[] b, int[] a) {
        return a[0] * a[0] + a[1] * a[1] - b[0] * b[0] - b[1] * b[1];
    }


}

public class kClosestPointOrigin {

        public static int[][] closePoint(int[][] nums, int k) {

            PriorityQueue<int[]> minheap = new PriorityQueue<>(new minHeapComparator());

            for (int index = 0; index < nums.length; index++) {

                minheap.add(nums[index]);

                if(minheap.size() > k){
                    minheap.poll();
                }

            }

            int[][] res = new int[k][2];

            while (k > 0) {

                var item = minheap.poll();

                res[--k] = item;

            }

            return res;

        }

    public static void main(String[] args) {

        int[][] points = {{0, 1},
                {1, 0}};

        int K = 2;

        closePoint(points, K);

    }
}
