package linkedList;

class DoublyNode {
    int val;
    DoublyNode prev;
    DoublyNode next;

    DoublyNode(int val) {

        this.val = val;
        this.next = null;
        this.prev = null;
    }

}

class DoublyList {

    DoublyNode head;

    DoublyList(int val) {
        head = new DoublyNode(val);
    }

    public void insertAtBegin(DoublyNode head, int val) {

        DoublyNode node = new DoublyNode(val);

        node.prev = null;

        node.next = head;

        this.head.prev = node;

        this.head = this.head.prev;

    }

    public void insertAtEnd(DoublyNode head, int val) {

        DoublyNode node = new DoublyNode(val);

        DoublyNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;

        node.prev = temp;

        node.next = null;

    }

    public void deleteAtBegin(DoublyNode head) {

        if (head == null) {
            System.out.println("List is empty");

        } else if (head.next == null) {

            deleteList();

        } else {

            this.head = this.head.next;

            this.head.prev = null;

            head.next = null;
        }

    }

    public void deleteAtEnd(DoublyNode head) {

        if (head == null) {

            System.out.println("List is empty");

        } else if (head.next == null) {

            deleteList();

        } else {

            DoublyNode prev = null;

            while (head.next != null) {

                prev = head;

                head = head.next;

            }

            prev.next = null;

            head.prev = null;

        }

    }

    public void deleteList() {

        this.head = null;

    }

    public void print(DoublyNode head) {

        if (head != null) {

            while (head != null) {

                System.out.print(" " + head.val);

                head = head.next;

            }
        } else {

            System.out.println("LIst is empty");

        }
        System.out.println();
    }


}


public class DoublyLinkedList {
    public static void main(String[] args) {

        DoublyList doublyList = new DoublyList(10);

        doublyList.insertAtBegin(doublyList.head, 20);

        doublyList.insertAtBegin(doublyList.head, 30);

        doublyList.insertAtBegin(doublyList.head, 40);

        doublyList.insertAtEnd(doublyList.head, 50);

        doublyList.insertAtEnd(doublyList.head, 60);

        doublyList.insertAtEnd(doublyList.head, 70);

        doublyList.print(doublyList.head);

        doublyList.deleteAtBegin(doublyList.head);
        doublyList.deleteAtBegin(doublyList.head);
        doublyList.deleteAtBegin(doublyList.head);
        doublyList.deleteAtBegin(doublyList.head);


        doublyList.print(doublyList.head);

        doublyList.deleteAtEnd(doublyList.head);


        doublyList.print(doublyList.head);


    }
}
