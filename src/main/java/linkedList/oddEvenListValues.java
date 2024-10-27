package linkedList;

class oddEvenList {


    public ListNode oddEven(ListNode head) {

        ListNode end = head;

        while (end.next != null) {

            end = end.next;

        }

        ListNode newEnd = end;
        ListNode curr = head;
        ListNode prev = null;

        while (curr.val % 2 == 1 && curr != end) {

            newEnd.next = curr;
            newEnd = newEnd.next;
            curr = curr.next;
            newEnd.next = null;

        }


        if (curr.val % 2 == 0) {

            head = curr;

            while (curr != end) {

                if (curr.val % 2 == 0) {

                    prev = curr;
                    curr = curr.next;

                } else {

                    prev.next = curr.next;
                    newEnd.next = curr;
                    curr.next = null;
                    curr = prev.next;
                    newEnd = newEnd.next;

                }
            }


        } else {
            prev = curr;
        }


        if (newEnd != end && end.val % 2 == 1) {

            prev.next = end.next;
            newEnd.next = end;
            end.next = null;


        }


        return head;
    }

}

public class oddEvenListValues {
    public static void main(String[] args) {

    }
}
