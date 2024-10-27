package linkedList;

public class reverseDoublyList {

    static DoublyNode reverseDLL(DoublyNode head){

        DoublyNode prev=null;
        DoublyNode curr=head;
        DoublyNode next=null;

        while(curr!=null){

            next = curr.next;

            curr.next = prev;

            curr.prev = next;

            prev=curr;

            curr=next;

        }

        head = prev;

        return head;
    }

    public static void main(String[] args) {

        reverseDLL(new DoublyNode(10));

    }
}
