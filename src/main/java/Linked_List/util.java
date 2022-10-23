package Linked_List;

public class util {

    static ListNode getList(int n){

        ListNode prev = null;

        for (int index = n; index >0; index--) {

            ListNode node = new ListNode(index);
            node.next = prev;
            prev = node;

        }

        return prev;

    }


    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 4 -> 5 -> 6-> 7 -> 8
        // n = 2

    }
}
