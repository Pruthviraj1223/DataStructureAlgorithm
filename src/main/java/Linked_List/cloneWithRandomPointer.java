package Linked_List;

import java.util.HashMap;

class clone {

    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }


    }

    public Node cloneWithHashMap(Node head) {
        if (head == null) {
            return null;
        }

        HashMap<Node, Node> map = new HashMap<>();

        Node temp = head;

        Node copyHead = new Node(temp.val);  // this is also important. We are assigning new memory for new list;

        Node copy = copyHead;

        map.put(temp, copy);

        temp = temp.next;

        while (temp != null) {

            Node node = new Node(temp.val);
            map.put(temp, node);
            copy.next = node;
            copy = copy.next;
            temp = temp.next;

        }

        temp = head;

        while (temp != null) {

            var node = map.get(temp);

            node.random = map.get(temp.random);

            temp = temp.next;

        }

        return copyHead;

    }

    public Node cloneWithoutHashMap(Node head) {

        if (head == null) {
            return null;
        }

        Node temp = head;
        Node next;

        while (temp != null) {

            next = temp.next;

            Node copy = new Node(temp.val);

            copy.next = next;

            temp.next = copy;

            temp = next;

        }


        temp = head;

        while (temp != null && temp.next != null) {

            if (temp.random != null) {

                temp.next.random = temp.random.next;
            }

            temp = temp.next.next;

        }

        temp = head;

        Node dummy = new Node(-1);

        Node copyPrev = dummy;

        while (temp != null) {

            next = temp.next;

            copyPrev.next = next;

            copyPrev = next;

            temp.next = next.next;

            temp = temp.next;

        }

        return dummy.next;
    }
}


public class cloneWithRandomPointer {
    public static void main(String[] args) {

    }
}
