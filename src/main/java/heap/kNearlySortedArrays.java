package heap;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class kNearlySortedArrays {

    static void nearlySorted(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int newIndex = 0;

        for (int index = 0; index < arr.length; index++) {

            minHeap.add(arr[index]);

            if (minHeap.size() > 0 && minHeap.size() > k) {

                arr[newIndex++] = minHeap.poll();

            }

        }

        Iterator<Integer> iterator = minHeap.iterator();

        while (iterator.hasNext()) {

            arr[newIndex++] = iterator.next();

            iterator.remove();

        }

        System.out.println(Arrays.toString(arr));


    }


    public static void main(String[] args) {

        int arr[] = {2, 6, 3, 12, 56, 8};

        nearlySorted(arr, 3);


    }
}
