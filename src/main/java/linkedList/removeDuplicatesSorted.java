package linkedList;

class sorted {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {

            return head;

        }

        ListNode curr = head;

        while (curr != null) {

            ListNode temp = curr;

            while (temp != null && temp.val == curr.val) {

                temp = temp.next;

            }

            curr.next = temp;

            curr = curr.next;

        }

        return head;
    }
}

public class removeDuplicatesSorted {
    public static void main(String[] args) {

    }
}
