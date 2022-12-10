package heap;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Solution {

    // Leetcode pass solution

    static class Node {
        int ele;
        int next;
        int index;

        public Node(int index, int next, int ele) {
            this.ele = ele;
            this.next = next;
            this.index = index;
        }
    }

    public int[] smallestRange(List<List<Integer>> nums) {

        PriorityQueue<Node> minHeap = new PriorityQueue<Node>(new Comparator<Node>() {
            public int compare(Node a, Node b) {
                return a.ele - b.ele;
            }
        });

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int index = 0; index < nums.size(); index++) {

            Node node = new Node(index, 0, nums.get(index).get(0));

            minHeap.add(node);

            max = Math.max(max,  nums.get(index).get(0));

        }

        int range = Integer.MAX_VALUE;

        int start = -1, end = -1;

        while (minHeap.size() == nums.size()) {

            Node root = minHeap.poll();

            min = root.ele;

            if (range > max - min) {

                range = max - min;

                start = min;

                end = max;

            }

            if (root.next + 1 < nums.get(root.index).size()) {

                root.next++;

                root.ele = nums.get(root.index).get(root.next);

                minHeap.add(root);

                if (root.ele > max) {

                    max = root.ele;

                }
            }
        }

        return new int[] { start, end };


    }
}

public class smallestRangeContainingElementsFromKLists {

    static class Node{
        int ele; // element itself
        int index; // index of the list
        int next; // next position

        Node(int ele,int index,int next){

            this.ele = ele;

            this.index = index;

            this.next = next;
        }

    }

    static void smallestRange(int [][]nums,int k){

        PriorityQueue<Node> minHeap = new PriorityQueue<>((a,b) -> a.ele - b.ele);

        int range = Integer.MAX_VALUE;
        int start = -1,end = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int index = 0; index < k; index++) {

            Node node = new Node(nums[index][0],index,1);

            minHeap.add(node);

            max = Math.max(max,node.ele);

        }

        while (minHeap.size() == nums.length) {

            Node root = minHeap.poll();

            if (range > max - root.ele + 1)
            {

                range = max - min + 1;

                start = root.ele;

                end = max;

            }

            if (root.next < nums[0].length) {

                root.ele = nums[root.index][root.next];

                root.next++;

                minHeap.add(root);

                if (root.ele > max) {

                    max = root.ele;         // for next iteration
                }

            } else {

                break;

            }
        }

        System.out.println("range : " + start + " : " + end + " size " + range);

    }

    public static void main(String[] args) {

        int[][] arr = { {4,10,15,24,26 },
                { 0,9,12,20 },
                { 5,18,22,30} };


        smallestRange(arr,arr.length);

    }
}
