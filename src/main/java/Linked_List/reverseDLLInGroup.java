package Linked_List;

import javax.print.DocFlavor;
import java.util.zip.CheckedOutputStream;

class reverse {


    DoublyNode reverseDLL(DoublyNode head, int k) {

        if (head == null) {
            return null;
        }

        head.prev = null;           // imp

        DoublyNode curr = head;
        DoublyNode prev;
        DoublyNode newHead = null;

        int count = 0;

        while (curr != null && count < k) {

            newHead = curr;
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;

            count++;
        }


        if (count >= k) {

            DoublyNode rest = reverseDLL(curr, k);
            head.next = rest;

            if (rest != null) {

                rest.prev = head;

            }
        }

        return newHead;

    }


}


public class reverseDLLInGroup {
    public static void main(String[] args) {

        DoublyNode head = new DoublyNode(1);
        DoublyNode node1 = new DoublyNode(2);
        DoublyNode node2 = new DoublyNode(3);
        DoublyNode node3 = new DoublyNode(4);
        DoublyNode node4 = new DoublyNode(5);
        DoublyNode node5 = new DoublyNode(6);
        DoublyNode node6 = new DoublyNode(7);

        head.next = node1;
        head.prev = null;

        node1.next = node2;
        node1.prev = head;

        node2.next = node3;
        node2.prev = node1;

        node3.next = node4;
        node3.prev = node2;

        node4.next = node5;
        node4.prev = node3;

        node5.next = node6;
        node5.prev = node4;

        node6.next = null;
        node6.prev = node5;

        head = new reverse().reverseDLL(head, 3);

        System.out.println();


    }
}
