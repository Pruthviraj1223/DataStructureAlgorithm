package linkedList;

class loop2{

    public void startingPoint(ListNode head){
        // hashset solution will work in leetcode.
        // GFG temp solution wll work here, not in leetcode.
    }

    public ListNode startingPointSlowFast(ListNode head){

        // REMEMBER IT'S THEORY IN BRIEF

        ListNode slow = head;
        ListNode fast = head;

        while(slow!=null && fast!=null && fast.next!=null){

            slow = slow.next;

            fast = fast.next.next;

            if(slow==fast){

                break;

            }

        }

        if(slow!=fast){
            return null;
        }


        slow = head;

        while (slow!=fast){

            slow = slow.next;
            fast = fast.next;

        }

        return slow;

    }

}

public class startingPointOfLoop {
    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        ListNode node1 = new ListNode(20);
        ListNode node2 = new ListNode(30);
        ListNode node3 = new ListNode(40);
        ListNode node4 = new ListNode(50);
        ListNode node5 = new ListNode(60);
        ListNode node6 = new ListNode(70);
        ListNode node7 = new ListNode(80);
        ListNode node8 = new ListNode(90);
        ListNode node9 = new ListNode(100);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        node9.next = node4;

        new loop2().startingPointSlowFast(head);


    }
}
