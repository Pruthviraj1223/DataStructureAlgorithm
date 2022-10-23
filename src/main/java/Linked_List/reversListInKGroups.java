package Linked_List;

class reverseINGroup{

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(-1);

        ListNode pointer = dummy;

        dummy.next = head;

        while(pointer!=null){

            ListNode node = pointer;

            for(int index=0;index<k && node!=null; index++){

                node = node.next;           // for checking k nodes is present or not

            }

            if(node==null){

                break;

            }

            ListNode prev = null;
            ListNode curr = pointer.next;
            ListNode next;

            for(int index=0;index<k;index++){

                next = curr.next;

                curr.next = prev;

                prev = curr;

                curr=next;

            }

            ListNode tail = pointer.next;

            tail.next = curr;

            pointer.next = prev;

            pointer = tail;

        }

        return dummy.next;

    }

}

public class reversListInKGroups {
    public static void main(String[] args) {



    }
}
