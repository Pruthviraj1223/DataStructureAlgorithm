package Linked_List;

class rotate {

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;

        int count = 1;

        while (temp.next != null) {

            temp = temp.next;

            count++;

        }

        temp.next = head;

        k = k % count;

        temp = temp.next;

        int x = count -k-1;

//        int x = count - k;

        while (x > 0) {

            temp = temp.next;

            x--;

        }

        ListNode next = temp.next;

        temp.next = null;

        return next;

    }


}

public class rotateList {
    public static void main(String[] args) {

    }
}