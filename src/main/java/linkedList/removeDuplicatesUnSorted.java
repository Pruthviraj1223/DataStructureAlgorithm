package linkedList;

import java.util.HashSet;

class unsorted{

    public void removeDuplicates(ListNode head){

        HashSet<Integer> duplicates = new HashSet<>();

        ListNode current = head;

        ListNode prev = null;

        while (current != null) {

            int currVal = current.val;

            if (duplicates.contains(currVal)) {

                prev.next = current.next;

            }

            else {

                duplicates.add(currVal);

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
