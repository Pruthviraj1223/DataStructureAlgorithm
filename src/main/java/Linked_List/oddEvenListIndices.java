package Linked_List;


class oddEven {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode evenHead = head.next;
        ListNode odd = head;
        ListNode even = odd.next;

        while (even != null && even.next != null) {

            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;

        }

        odd.next = evenHead;

        return head;

    }
}

public class oddEvenListIndices {
    public static void main(String[] args) {

    }
}
