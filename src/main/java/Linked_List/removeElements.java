package Linked_List;

class remove{

    public ListNode re(ListNode head,int val){

        if(head==null){

            return null;

        }


        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;



        while(temp!=null){

            if(temp.val==val){

                prev.next = temp.next;


            }else{


                prev = temp;

            }

            temp = temp.next;


        }


        return dummy.next;

    }


}

public class removeElements {
    public static void main(String[] args) {

    }
}
