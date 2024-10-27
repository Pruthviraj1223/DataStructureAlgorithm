package heap;

import java.util.*;

class sortedOut implements Comparator<Map.Entry<Integer, Integer>> {

    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return o1.getValue() == o2.getValue() ? o2.getKey() - o1.getKey() : o1.getValue() - o2.getValue();
    }
}

public class frequencySort {

    static int[] sort(int[] nums) {

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {

            frequency.put(num, frequency.getOrDefault(num, 0) + 1);

        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(new sortedOut());

        minHeap.addAll(frequency.entrySet());

        // we have used minHeap concept.
        // minHeap with ascending based on frequency.

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequency.entrySet());

        // it is given in the question that if it has same frequency then sort descending based on key
        // else sort in ascending based on frequency

        list.sort((a, b) -> a.getValue() == b.getValue() ? b.getKey() - a.getKey() : a.getValue() - b.getValue());

        int position = 0;

        int[] result = new int[nums.length];

        var iterator = minHeap.iterator();

        while (iterator.hasNext()) {

            var item = iterator.next();

            int count = item.getValue();

            int key = item.getKey();

            for (int index = 0; index < count; index++) {

                result[position++] = key;

            }

            iterator.remove();
        }

        return result;
    }

    public static void main(String[] args) {

        var arr = new int[]{1, 1, 2, 2, 2, 3};
        sort(arr);

        // you can watch aditya verma video , we can also do that
        // understand comprattorPractice class first.
        // we have successfully implemented minHeap solution
        // List solution is using comparator function



    }
}
