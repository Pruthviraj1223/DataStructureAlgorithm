package linkedList;

class swap{
    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode curr = head.next;

        ListNode prev= head , next = null;

        head = curr;

        while(true){

            curr = prev.next;

            next = curr.next;

            curr.next = prev;

            if(next==null || next.next==null){

                prev.next = next;
                break;

            }

            prev.next = next.next;

            prev = next;


        }

        return head;


    }
}

public class swapNodesInPairs {
    public static void main(String[] args) {

    }
}
