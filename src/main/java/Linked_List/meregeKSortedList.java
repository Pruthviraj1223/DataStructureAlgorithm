package Linked_List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class mergeK{

    public void mergeKList(ListNode[] listNodes){

        LinkedList<ListNode> queue = new LinkedList<>(Arrays.asList(listNodes));

        while (queue.size()>1){

            listNodes[0] = mergeList.mergeTwoLists(listNodes[0],listNodes[queue.size()-1]);
            queue.pollLast();

        }



    }

}

public class meregeKSortedList {
    public static void main(String[] args) {

        ListNode []listNodes = new ListNode[4];
        listNodes[0] = util.getList(2);
        listNodes[1] = util.getList(3);
        listNodes[2] = util.getList(4);
        listNodes[3] = util.getList(5);

        new mergeK().mergeKList(listNodes);

    }
}
