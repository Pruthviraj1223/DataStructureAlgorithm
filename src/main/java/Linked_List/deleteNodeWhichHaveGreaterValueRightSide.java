package Linked_List;

class deleteNode {

    public ListNode delete(ListNode head) {

        head = reverseList.reverseRecursion(head);

        ListNode curr = head;

        ListNode maxNode = head;

        ListNode temp ;

        while (curr != null && curr.next!=null) {

            if (curr.next.val < maxNode.val) {

                temp = curr.next;

                curr.next = temp.next;

            } else {

                curr = curr.next;

                maxNode = curr;

            }
        }

        return reverseList.reverseRecursion(head);
    }


}


public class deleteNodeWhichHaveGreaterValueRightSide {
    public static void main(String[] args) {

    }
}
