package Heap;

import java.util.*;

class MaxHeapComparator implements Comparator<Pair> {

    @Override
    public int compare(Pair P1, Pair P2) {

            return P2.getValue().compareTo(P1.getValue());

    }
}

class Pair {
    int key;
    int val;


    Pair(int key, int val) {
        this.key = key;
        this.val = val;
    }

    Integer getValue() {

        return val;

    }

    Integer getKey(){
        return key;
    }

}

public class kClosestElement {

    static List<Integer> kCloseElement(int[] arr, int k, int x) {

        List<Integer> ans = new ArrayList<>();

        // instead of pair you can use map or int[]
        // just like we did in any other questions

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((p1, p2) -> p2.getKey().compareTo(p1.getKey()));

        for (int index = 0; index < arr.length; index++) {

            maxHeap.add(new Pair(Math.abs(arr[index] - x),arr[index]));

            if (maxHeap.size() > k) {

                maxHeap.poll();

            }

        }

        while (!maxHeap.isEmpty()) {

            ans.add(maxHeap.peek().getValue());

            maxHeap.poll();
        }

        Collections.sort(ans);

        return ans;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int X = 3, K = 4;

        kCloseElement(arr,K,X);

        // this solution is correct but not passed in leetcode.

        // Binary search/Two pointer is more effective.
        // So always applied that first.


    }
}
