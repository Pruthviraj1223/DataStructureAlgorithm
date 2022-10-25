package Linked_List;

class middle{

    public ListNode findMiddle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(slow!=null && fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;
    }


}


public class middleOfLInkedList {
    public static void main(String[] args) {

        new middle().findMiddle(util.getList(new int[]{1,5,7}));

    }
}
