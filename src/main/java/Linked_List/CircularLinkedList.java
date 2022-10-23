package Linked_List;

class CircularList {

    ListNode head;

    CircularList(int val) {

        head = new ListNode(val);

        head.next = head;

    }

    void insertAtEnd(ListNode head, int val) {

        if (head == null) {

            this.head = new ListNode(val);

            this.head.next = this.head;

        } else {

            ListNode listNode = new ListNode(val);

            ListNode temp = head;

            while (temp.next != this.head) {

                temp = temp.next;

            }

            temp.next = listNode;

            listNode.next = head;

        }
    }

    void insertAtBegin(ListNode head, int val) {

        if (head == null) {

            this.head = new ListNode(val);

            this.head.next = this.head;

        } else {

            ListNode listNode = new ListNode(val);

            listNode.next = this.head;

            ListNode temp = head;

            while (temp.next != this.head) {

                temp = temp.next;

            }

            temp.next = listNode;

            this.head = listNode;

        }

    }

    void insertAfter(ListNode head, int after, int val) {

        ListNode listNode = new ListNode(val);

        ListNode temp = head;

        while (temp.next != this.head && temp.val != after) {

            temp = temp.next;

        }

        if (temp.next != this.head) {

            listNode.next = temp.next;

            temp.next = listNode;

        } else {

            System.out.println("invalid after value");
        }
    }

    void insertBefore(ListNode head, int before, int val) {

        ListNode listNode = new ListNode(val);

        ListNode temp = head;

        ListNode prev = null;

        while (temp != null && temp.val != before) {

            prev = temp;

            temp = temp.next;

        }

        if (temp != null) {

            prev.next = listNode;

            listNode.next = temp;

        } else {
            System.out.println("Before value is invalid");
        }


    }

    void deleteAtBegin(ListNode head) {

        if (head == null) {

            System.out.println("head is null. Can not perform this operation");

        } else {

            ListNode temp = head;

            while (temp.next != this.head) {

                temp = temp.next;

            }

            this.head = head.next;

            temp.next = this.head;

        }
    }

    void deleteAtEnd(ListNode head) {

        if (head == null) {
            System.out.println("head  is null. Can not perform this operation");
        } else {

            ListNode temp = head;

            ListNode prev = null;

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

    void deleteBefore(ListNode head, int before) {

        if (head == null) {

            System.out.println("can not perform this operation");

        } else if (head.val == before) {

            System.out.println("use delete begin !!!");

        } else {

            ListNode next = head;

            ListNode curr = null;

            ListNode prev = null;

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

    void deleteAfter(ListNode head, int after) {

        if (head == null) {

            System.out.println("can not perform");

        } else if (head.val == after) {

            System.out.println("use delete begin");

        } else {

            ListNode temp = head;

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

    void print(ListNode head) {

        if (head != null) {

            ListNode temp = head;

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
