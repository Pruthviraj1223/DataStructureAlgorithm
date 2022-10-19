package Linked_List;

class CircularList {

    Node head;

    CircularList(int val) {

        head = new Node(val);

        head.next = head;

    }

    void insertAtEnd(Node head, int val) {

        if (head == null) {

            this.head = new Node(val);

            this.head.next = this.head;

        } else {

            Node node = new Node(val);

            Node temp = head;

            while (temp.next != this.head) {

                temp = temp.next;

            }

            temp.next = node;

            node.next = head;

        }
    }

    void insertAtBegin(Node head, int val) {

        if (head == null) {

            this.head = new Node(val);

            this.head.next = this.head;

        } else {

            Node node = new Node(val);

            node.next = this.head;

            Node temp = head;

            while (temp.next != this.head) {

                temp = temp.next;

            }

            temp.next = node;

            this.head = node;

        }

    }

    void insertAfter(Node head, int after, int val) {

        Node node = new Node(val);

        Node temp = head;

        while (temp.next != this.head && temp.val != after) {

            temp = temp.next;

        }

        if (temp.next != this.head) {

            node.next = temp.next;

            temp.next = node;

        } else {

            System.out.println("invalid after value");
        }
    }

    void insertBefore(Node head, int before, int val) {

        Node node = new Node(val);

        Node temp = head;

        Node prev = null;

        while (temp != null && temp.val != before) {

            prev = temp;

            temp = temp.next;

        }

        if (temp != null) {

            prev.next = node;

            node.next = temp;

        } else {
            System.out.println("Before value is invalid");
        }


    }

    void deleteAtBegin(Node head) {

        if (head == null) {

            System.out.println("head is null. Can not perform this operation");

        } else {

            Node temp = head;

            while (temp.next != this.head) {

                temp = temp.next;

            }

            this.head = head.next;

            temp.next = this.head;

        }
    }

    void deleteAtEnd(Node head) {

        if (head == null) {
            System.out.println("head  is null. Can not perform this operation");
        } else {

            Node temp = head;

            Node prev = null;

            while (temp.next != this.head) {

                prev = temp;

                temp = temp.next;

            }

            if(prev==null){

                deleteList();

            }else {

                prev.next = this.head;
            }


        }

    }

    void deleteBefore(Node head, int before) {

        if (head == null) {

            System.out.println("can not perform this operation");

        } else if (head.val == before) {

            System.out.println("use delete begin !!!");

        } else {

            Node next = head;

            Node curr = null;

            Node prev = null;

            while (next.val != before) {

                prev = curr;

                curr = next;

                next = next.next;

            }

            if (prev != null) {

                prev.next = next;

                curr.next = null;

            } else {

                System.out.println("wrong before value");

            }

        }


    }

    void deleteAfter(Node head, int after) {

        if (head == null) {

            System.out.println("can not perform");

        } else if (head.val == after) {

            System.out.println("use delete begin");

        } else {

            Node temp = head;

            while (temp.val != after) {

                temp = temp.next;

            }

            if (temp.next != null) {

                temp.next = temp.next.next;

            }

        }

    }

    void deleteList() {

        this.head = null;

        System.out.println("List is deleted");

    }

    void print(Node head) {

        if (head != null) {

            Node temp = head;

            while (temp.next != head) {

                System.out.print(" " + temp.val);

                temp = temp.next;

            }

            System.out.print(" " + temp.val);

        } else {

            System.out.println("List is empty");

        }

        System.out.println();

    }

}

public class CircularLinkedList {
    public static void main(String[] args) {

        CircularList circularList = new CircularList(10);

        circularList.insertAtBegin(circularList.head,20);

        circularList.insertAtBegin(circularList.head,30);

        circularList.insertAtEnd(circularList.head,40);

        circularList.print(circularList.head);

        circularList.deleteAtBegin(circularList.head);

        circularList.print(circularList.head);

        circularList.insertAfter(circularList.head,10,25);

        circularList.print(circularList.head);

        circularList.deleteAtEnd(circularList.head);
        circularList.deleteAtEnd(circularList.head);
        circularList.deleteAtEnd(circularList.head);
        circularList.deleteAtEnd(circularList.head);
        circularList.deleteAtEnd(circularList.head);


        circularList.print(circularList.head);

        circularList.deleteAtBegin(circularList.head);
        circularList.deleteAtBegin(circularList.head);
        circularList.deleteAtBegin(circularList.head);
        circularList.deleteAtBegin(circularList.head);


    }
}
