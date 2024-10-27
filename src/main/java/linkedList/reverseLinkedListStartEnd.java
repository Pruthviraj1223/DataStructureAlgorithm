package linkedList;

class List2 {
    ListNode reverseListStartEndPoint(ListNode head, int start, int end) {

        if (head == null) {
            return null;
        }

        ListNode prev = null;

        ListNode curr = head;

        while (start > 1) {

            prev = curr;

            curr = curr.next;

            start--;

            end--;

        }

        ListNode next;

        ListNode dummyPrev = prev;

        ListNode dummyCurr = curr;

        while (end > 0) {

            next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;

            end--;
        }

        if (dummyPrev != null) {

            dummyPrev.next = prev;

        } else {

            head = prev;
        }

        dummyCurr.next = curr;

        return head;

    }

}

public class reverseLinkedListStartEnd {
    public static void main(String[] args) {


        ListNode head = new ListNode(10);
        ListNode temp1 = new ListNode(20);
        ListNode temp2 = new ListNode(30);
        ListNode temp3 = new ListNode(40);
        ListNode temp4 = new ListNode(50);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = null;


    }
}
