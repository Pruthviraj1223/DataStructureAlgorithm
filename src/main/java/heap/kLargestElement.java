package heap;

import java.util.PriorityQueue;

public class kLargestElement {

    static void largestElement(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int index = 0; index < arr.length; index++) {

            minHeap.add(arr[index]);

            if (minHeap.size() > k) {
                minHeap.poll();
            }

        }

        System.out.println(minHeap.peek());

        System.out.println(minHeap);


    }

    public static void main(String[] args) {

        int []arr= new int[]{3,54,2,78,41,11};

        largestElement(arr,3);

    }
}
