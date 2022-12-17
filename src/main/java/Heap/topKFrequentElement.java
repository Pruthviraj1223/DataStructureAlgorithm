package Heap;

import java.util.*;

public class topKFrequentElement {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {

            count.put(num, count.getOrDefault(num, 0) + 1);

        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));

        maxHeap.addAll(count.entrySet());

        int[] temp = new int[k];

        int index = 0;

        while (index < k) {

            Map.Entry<Integer, Integer> entry = maxHeap.poll();

            temp[index++] = entry.getKey();

        }

        return temp;

    }

    public static void main(String[] args) {

        // here we have use max heap
        // we can also use heap as per aditya verma video and our previous approaches but that is not compatible in Leetcode


    }

}
