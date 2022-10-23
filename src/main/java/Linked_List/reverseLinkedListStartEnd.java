package Linked_List;

class List2{
    ListNode reverseListStartEndPoint(ListNode head, int left, int right){
        if(head==null){
            return head;
        }

        ListNode prev = null;

        ListNode curr = head;

        while(left>1){

            prev = curr;

            curr = curr.next;

            left--;

            right--;

        }

        ListNode next;

        ListNode con = prev;

        ListNode tail = curr;

        while(right>0){

            next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;

            right--;
        }

        if(con!=null){
            con.next = prev;

        }else{
            head = prev;
        }

        tail.next = curr;

        return head;

    }

}

public class reverseLinkedListStartEnd {
    public static void main(String[] args) {


        ListNode head = new ListNode(10);
        ListNode temp1 = new ListNode(20);
        ListNode temp2 = new ListNode(30);
        ListNode temp3 = new ListNode(40);
        ListNode temp4  = new ListNode(50);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = null;



    }
}
