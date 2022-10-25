package Linked_List;

class count {

    public void countTriplets(DoublyNode head, int target) {

        DoublyNode last = head;
        int count = 0;

        while (last.next != null) {

            last = last.next;

        }

        for (DoublyNode curr = head; curr != null; curr = curr.next) {

            DoublyNode first = curr.next;

            DoublyNode second = last;

            int x = target - curr.val;

            while (first != null && second != null && first != second) {

                if (first.val + second.val == x) {

                    System.out.println(curr.val + " " + first.val + " " + second.val);

                    first = first.next;

                    second = second.prev;

                    count++;

                } else if (first.val + second.val > x) {

                    second = second.prev;

                } else {

                    first = first.next;

                }

            }
        }

        System.out.println("count " + count);

    }


}

public class countTripletsInDLL {
    public static void main(String[] args) {

        util.getList(new int[]{1,5,7});

        DoublyNode head = new DoublyNode(1);
        DoublyNode node1 = new DoublyNode(2);
        DoublyNode node2 = new DoublyNode(4);
        DoublyNode node3 = new DoublyNode(5);
        DoublyNode node4 = new DoublyNode(6);
        DoublyNode node5 = new DoublyNode(8);
        DoublyNode node6 = new DoublyNode(9);

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

        new count().countTriplets(head,17);


    }
}
