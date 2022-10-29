package Linked_List;

class reverseList {

    static ListNode reverseRecursion(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode rest = reverseRecursion(head.next);

        head.next.next = head;

        head.next = null;

        return rest;

    }

    ListNode reverseIterative(ListNode head) {

        if (head == null) {

            return null;

        }

        ListNode prev = null;

        ListNode next = head;

        ListNode curr = head;

        while (curr != null) {

            next = next.next;

            curr.next = prev;

            prev = curr;

            curr = next;

        }

        head = prev;

        return head;

    }


}

public class reverseLinkedList {
    public static void main(String[] args) {

        reverseList r = new reverseList();
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

        head = r.reverseRecursion(head);

        System.out.println();

    }
}
