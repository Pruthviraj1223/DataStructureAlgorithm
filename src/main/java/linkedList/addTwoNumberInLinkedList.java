package linkedList;

class List {

    public ListNode addTwoList(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);

        ListNode head = dummy;

        int sum = 0;

        while (l1 != null || l2 != null) {

            sum = sum / 10;

            if (l1 != null) {

                sum += l1.val;

                l1 = l1.next;

            }

            if (l2 != null) {

                sum += l2.val;

                l2 = l2.next;

            }

            dummy.next = new ListNode(sum % 10);

            dummy = dummy.next;

        }

        if (sum / 10 == 1) {

            dummy.next = new ListNode(1);

        }

        return head.next;

    }

}

public class addTwoNumberInLinkedList {
    public static void main(String[] args) {

        new List().addTwoList(Util.getList(new int[]{1,5,7}), Util.getList(new int[]{1,5,7}));

    }
}
