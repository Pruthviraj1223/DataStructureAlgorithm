package heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class HeapNode {
    int i, j, val;

    HeapNode(int i, int j, int val) {
        this.i = i;
        this.j = j;
        this.val = val;
    }
}


public class mergeKSortedArrays {

    static List<Integer> mergeKArrays(int[][] arr) {

        PriorityQueue<HeapNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        List<Integer> result = new ArrayList<>();

        for (int index = 0; index < arr.length; index++) {

            minHeap.add(new HeapNode(index, 0, arr[index][0]));
        }

        while (!minHeap.isEmpty()) {

            var currNode = minHeap.poll();

            result.add(currNode.val);

            if (currNode.j < arr[currNode.i].length - 1) {

                minHeap.add(new HeapNode(currNode.i, currNode.j + 1, arr[currNode.i][currNode.j + 1]));

            }

        }

        return result;

    }

    public static void main(String[] args) {

        // similar approach of merge two sorted list

        int[][] arr = { { 2, 6, 12 },
                { 1, 9 },
                { 23, 34, 90, 2000 } };

        mergeKArrays(arr);

    }
}
