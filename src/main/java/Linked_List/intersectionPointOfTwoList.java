package Linked_List;

class intersection{
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {

        int count1=0;
        int count2=0;


        ListNode temp=head1;

        while(temp!=null){

            count1++;

            temp = temp.next;

        }

        temp = head2;

        while(temp!=null){


            count2++;
            temp = temp.next;


        }

        if(count1>=count2){

            int x = count1-count2;

            while(x>0){

                head1=head1.next;

                x--;

            }

        }else{

            int x = count2-count1;

            while(x>0){

                head2=head2.next;
                x--;

            }
        }

        while(head1!=null && head2!=null){

            if(head1==head2){

                return head1;
            }

            head1 = head1.next;

            head2 = head2.next;

        }
        return null;

    }
}

public class intersectionPointOfTwoList {
    public static void main(String[] args) {

    }
}
