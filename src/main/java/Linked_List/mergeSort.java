package Linked_List;


class Solution {

    ListNode findMiddle(ListNode head) {

        ListNode slow = head, fast = head.next;

        while (fast != null && fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;

        }

        return slow;

    }

    ListNode merge(ListNode head1, ListNode head2) {

        ListNode result = new ListNode(-1);

        ListNode temp = result;

        while (head1 != null && head2 != null) {

            if (head1.val < head2.val) {

                temp.next = head1;

                head1 = head1.next;

            } else {

                temp.next = head2;

                head2 = head2.next;

            }

            temp = temp.next;

        }

        while (head1 != null) {

            temp.next = head1;

            head1 = head1.next;

            temp = temp.next;

        }

        while (head2 != null) {

            temp.next = head2;

            head2 = head2.next;

            temp = temp.next;

        }

        return result.next;

    }

     ListNode sortList(ListNode head) {

        if (head.next == null) {

            return head;

        }

        ListNode mid = findMiddle(head);

        ListNode head2 = mid.next;

        mid.next = null;

        ListNode newHead1 = sortList(head);

        ListNode newHead2 = sortList(head2);

        return merge(newHead1, newHead2);

    }
}

public class mergeSort {
    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        ListNode temp1 = new ListNode(4);
        ListNode temp2 = new ListNode(1);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = null;


        head = new Solution().sortList(head);

        System.out.println(head);

    }
}
