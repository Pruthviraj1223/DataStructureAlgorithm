package linkedList;

class sort {

    public ListNode sort012(ListNode head) {


        ListNode zero = new ListNode(-1);
        ListNode one = new ListNode(-1);
        ListNode two = new ListNode(-1);

        ListNode zeroDummy = zero, oneDummy = one, twoDummy = two;

        ListNode curr = head;


        while (curr != null) {

            if (curr.val == 0) {

                zero.next = curr;

                zero = zero.next;


            } else if (curr.val == 1) {

                one.next = curr;

                one = one.next;


            } else if (curr.val == 2) {

                two.next = curr;

                two = two.next;

            }

            curr = curr.next;


        }

        zero.next = (one.next != null) ? oneDummy.next : twoDummy.next;
        one.next = twoDummy.next;
        two.next = null;


        head = zeroDummy.next;

        return head;

    }


}


public class sort012LinkedList {
    public static void main(String[] args) {

        ListNode head = new ListNode(2);
        ListNode temp1 = new ListNode(1);
        ListNode temp2 = new ListNode(1);
        ListNode temp3 = new ListNode(0);
        ListNode temp4  = new ListNode(2);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = null;

        new sort().sort012(head);


    }
}
