package Linked_List;

class reverseList {

    Node reverseRecursion(Node head){

        if (head == null || head.next == null)
            return head;

        Node rest = reverseRecursion(head.next);

        head.next.next = head;

        head.next = null;

        return rest;

    }

    Node reverseIterative(Node head) {

        if(head==null){

            return null;

        }

        Node prev=null;

        Node next=head;

        Node curr=head;

        while (curr!=null){

            next = next.next;

            curr.next = prev;

            prev= curr;

            curr=next;

        }

        head = prev;

        return head;

    }

}

public class reverseLinkedList {
    public static void main(String[] args) {

        reverseList r = new reverseList();
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4  = new Node(50);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = null;

        head = r.reverseRecursion(head);

        System.out.println();

    }
}
