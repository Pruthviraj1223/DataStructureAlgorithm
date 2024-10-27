package linkedList;

class delete{
    public void deleteNode(ListNode node) {

        ListNode next = node.next;

        node.val = next.val;

        node.next = next.next;

        next.next = null;


    }
}


public class deleteWithoutHeadPointer {
    public static void main(String[] args) {

    }
}
