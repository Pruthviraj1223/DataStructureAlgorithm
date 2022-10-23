package Linked_List;

class add {

    public ListNode add1(ListNode head) {

        head = reverseList.reverseRecursion(head);

        ListNode temp = null;

        ListNode result = head;

        int carry = 1;

        int sum;

        while (head != null) {

            sum = carry + head.val;     // you are actually adding '1' here

            carry = sum >= 10 ? 1 : 0;

            head.val = (sum % 10);         // you are storing value here

            temp = head;

            head = head.next;

        }

        if (carry > 0 && temp != null) {

            temp.next = new ListNode(carry);

        }

        head = reverseList.reverseRecursion(result);

        return head;

    }

}


public class add1toNumber {
    public static void main(String[] args) {

        new add().add1(util.getList(3));

    }
}
