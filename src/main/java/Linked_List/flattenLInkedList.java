package Linked_List;

class Node {
    int val;
    Node next;
    Node down;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.down = null;
    }

}

class Flatten {

    Node head;


    Node merge(Node head1, Node head2) {

        if (head1 == null) {

            return head2;

        }

        if (head2 == null) {

            return head1;

        }

        Node result;

        if (head1.val < head2.val) {

            result = head1;

            result.down = merge(head1.down, head2);

        } else {

            result = head2;

            result.down = merge(head1, head2.down);

        }

        result.next = null;

        return result;


    }


    Node flattenList(Node head) {


         /* Let us create the following linked list
            5 -> 10 -> 19 -> 20
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45
        */

        if (head == null || head.next == null) {

            return head;

        }

        head.next = flattenList(head.next);

        head = merge(head, head.next);

        return head;

    }

    Node push(Node head, int data) {
        Node node = new Node(data);

        node.down = head;

        head = node;

        return head;
    }

}


public class flattenLInkedList {
    public static void main(String[] args) {

        Flatten L = new Flatten();

        L.head = L.push(L.head, 30);
        L.head = L.push(L.head, 8);
        L.head = L.push(L.head, 7);
        L.head = L.push(L.head, 5);

        L.head.next = L.push(L.head.next, 20);
        L.head.next = L.push(L.head.next, 10);

        L.head.next.next = L.push(L.head.next.next, 50);
        L.head.next.next = L.push(L.head.next.next, 22);
        L.head.next.next = L.push(L.head.next.next, 19);

        L.head.next.next.next
                = L.push(L.head.next.next.next, 45);
        L.head.next.next.next
                = L.push(L.head.next.next.next, 40);
        L.head.next.next.next
                = L.push(L.head.next.next.next, 35);
        L.head.next.next.next
                = L.push(L.head.next.next.next, 20);

        // Function call
        L.head = L.flattenList(L.head);

        System.out.println();

    }
}
