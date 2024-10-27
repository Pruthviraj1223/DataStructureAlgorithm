package linkedList;

class pratition {

    public ListNode partition(ListNode head, int x) {

        ListNode dummyHead = new ListNode(-1);
        ListNode temp = dummyHead;

        ListNode dummyHead2 = new ListNode(-1);
        ListNode temp2 = dummyHead2;

        while (head != null) {

            if (head.val < x) {

                temp.next = head;
                temp = temp.next;

            } else {

                temp2.next = head;
                temp2 = temp2.next;

            }

            head = head.next;
        }

        temp.next = dummyHead2.next;

        temp2.next = null;

        return dummyHead.next;

    }
}

public class partitionAroundGivenValue {
    public static void main(String[] args) {

    }
}
