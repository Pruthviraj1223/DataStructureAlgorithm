package linkedList;


import java.util.Stack;

class check {

    ListNode head1;
    ListNode left;

    boolean isPalindromeStack(ListNode head) {

        if (head == null) {

            return false;
        }

        if (head.next == null) {

            return true;

        }

        Stack<Integer> st = new Stack<>();

        ListNode slow = head;

        while (slow != null) {

            st.push(slow.val);
            slow = slow.next;

        }

        while (head != null && st.size() > 0) {

            if (head.val != st.pop()) {

                return false;
            }

            head = head.next;

        }

        return true;


    }

    boolean isPalindromeRecursion(ListNode head) {

        head1 = head;

        return isPal(head);

    }

    boolean isPal(ListNode right) {

        left = head1;

        if (right == null) {
            return true;
        }

        boolean isPal = isPal(right.next);

        if (!isPal) {

            return false;
        }


        boolean isp1 = (left.val == right.val);

        left = left.next;

        return isp1;

    }

}


public class checkPalindromeLIst {
    public static void main(String[] args) {

        new check().isPalindromeRecursion(Util.getList(new int[]{1, 2, 3}));

    }
}
