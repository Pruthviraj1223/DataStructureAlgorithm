package Linked_List;

import java.util.*;
import java.util.List;

class mergeK {

    public void mergeKList(ListNode[] listNodes) {

        LinkedList<ListNode> queue = new LinkedList<>(Arrays.asList(listNodes));

        while (queue.size() > 1) {

            listNodes[0] = mergeList.mergeTwoLists(listNodes[0], listNodes[queue.size() - 1]);

            queue.pollLast();

        }
    }

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(lists.length , (o1, o2) -> o1.val - o2.val);

        ListNode dummy = new ListNode(0);

        ListNode tail = dummy;

        for (ListNode node : lists) {

            if (node != null) {

                minHeap.add(node);

            }
        }

        // 1 - 5  - 7
        // 2 - 4  - 10

        // 0 -> 1 (and rest of the list [5 - 7]  will add again to queue)
        // 0 -> 1 -> 2 (and rest of the list [4 - 10] list will be added to queue)
        // 0 -> 1 -> 2 -> 4 (and rest of the list [10] will add to queue)

        while (!minHeap.isEmpty()) {

            tail.next = minHeap.poll();

            tail = tail.next;

            if (tail.next != null){

                minHeap.add(tail.next);         // rest of the list will be added

            }
        }
        return dummy.next;
    }

}

public class mergeKSSortedList {
    public static void main(String[] args) {

        ListNode[] listNodes = new ListNode[4];
        listNodes[0] = util.getList(new int[]{1, 5, 7});
        listNodes[1] = util.getList(new int[]{2, 4, 10});
        listNodes[2] = util.getList(new int[]{3, 6, 9});
        listNodes[3] = util.getList(new int[]{12, 15, 17});

        var ans = new mergeK().mergeKLists(listNodes);

        System.out.println(ans);

        new mergeK().mergeKList(listNodes);

    }
}
