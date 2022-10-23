package Linked_List;

import java.util.HashSet;

class unsorted{

    public void removeDuplicates(ListNode head){

        HashSet<Integer> duplicates = new HashSet<>();

        ListNode current = head;

        ListNode prev = null;

        while (current != null) {

            int curval = current.val;

            if (duplicates.contains(curval)) {

                prev.next = current.next;

            }

            else {

                duplicates.add(curval);

                prev = current;

            }

            current = current.next;

        }
    }


}


public class removeDuplicatesUnSorted {

    public static void main(String[] args) {

    }
}
