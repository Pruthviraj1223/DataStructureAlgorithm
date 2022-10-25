package Linked_List;

public class util {

    static ListNode getList(int []arr){

        ListNode head = new ListNode(arr[0]);

        ListNode prev = head;

        for (int index = 1; index <arr.length; index++) {

            ListNode node = new ListNode(arr[index]);
            prev.next = node;
            prev = node;

        }

        return head;

    }


    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 4 -> 5 -> 6-> 7 -> 8
        // n = 2

        getList(new int[]{1,5,6,7,32});

    }
}
