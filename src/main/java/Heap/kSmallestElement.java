package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class kSmallestElement {

    static void smallestElement(int[] arr, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int index = 0; index < arr.length; index++) {

            maxHeap.add(arr[index]);

            if (maxHeap.size() > k) {

                maxHeap.poll();

            }

        }

        System.out.println(maxHeap.peek());

        System.out.println(maxHeap);


    }

    public static void main(String[] args) {

        int []arr= new int[]{3,54,2,78,41,11};

        smallestElement(arr,3);

        // Time complexity : o(nlogk)

    }
}
