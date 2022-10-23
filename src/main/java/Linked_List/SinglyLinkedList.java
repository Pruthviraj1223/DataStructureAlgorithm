package Linked_List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {

        this.val = val;
        this.next = null;
    }

}


class SinglyList {

    ListNode head;

    SinglyList(int val) {

        head = new ListNode(val);

    }

    void insertAtEnd(ListNode head, int val) {

        if (head == null) {

            this.head = new ListNode(val);

        } else {

            ListNode listNode = new ListNode(val);

            ListNode temp = head;

            while (temp.next != null) {

                temp = temp.next;

            }

            temp.next = listNode;

        }
    }

    void insertAtBegin(ListNode head, int val) {

        if (head == null) {

            this.head = new ListNode(val);

        } else {

            ListNode listNode = new ListNode(val);

            listNode.next = head;

            this.head = listNode;

        }

    }

    void insertAfter(ListNode head, int after, int val) {

        ListNode listNode = new ListNode(val);

        ListNode temp = head;

        while (temp != null && temp.val != after) {

            temp = temp.next;

        }

        if (temp != null) {

            listNode.next = temp.next;

            temp.next = listNode;

        } else {

            System.out.println("After value is invalid");

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

            this.head = head.next;

            temp.next = null;

        }
    }

    void deleteAtEnd(ListNode head) {

        if (head == null) {
            System.out.println("head  is null. Can not perform this operation");
        } else {

            ListNode temp = head;

            ListNode prev = null;

            while (temp.next != null) {

                prev = temp;

                temp = temp.next;

            }

            prev.next = null;

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

            if (temp.next != null){

                temp.next = temp.next.next;

            }

        }

    }

    void deleteList(ListNode head){

        this.head = null;

        System.out.println("List is deleted");

    }

    void print(ListNode head) {


        if (head != null) {

            ListNode temp = head;

            while (temp != null) {

                System.out.print(" " + temp.val);

                temp = temp.next;

            }

        } else {

            System.out.println("List is empty");

        }

        System.out.println();

    }


}


public class SinglyLinkedList {
    public static void main(String[] args) {

        SinglyList list = new SinglyList(10);

        list.insertAtEnd(list.head, 20);

        list.insertAtEnd(list.head, 30);

        list.insertAtEnd(list.head, 40);

        list.insertAtEnd(list.head, 50);

        list.insertAtEnd(list.head, 60);

        list.insertAtBegin(list.head, 100);

        list.insertAtBegin(list.head, 110);

        list.insertAfter(list.head, 40, 45);

        list.insertBefore(list.head, 30, 25);

        list.print(list.head);

        list.deleteAtBegin(list.head);

        list.deleteAtBegin(list.head);

        list.print(list.head);

        list.deleteAtEnd(list.head);

        list.deleteAtEnd(list.head);

        list.print(list.head);

        list.deleteBefore(list.head, 30);

        list.print(list.head);

        list.deleteAfter(list.head, 20);

        list.deleteAfter(list.head, 40);

        list.print(list.head);

        list.deleteList(list.head);

        list.print(list.head);

    }
}
