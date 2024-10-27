package linkedList;


class mergeList {

    public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {

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

}


public class meregTwoSortedList {
    public static void main(String[] args) {

    }
}
