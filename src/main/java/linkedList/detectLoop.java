package linkedList;


import java.util.HashSet;

class loop{
    public boolean hasCycleHashSet(ListNode head) {

        HashSet<ListNode> originals = new HashSet<>();

        while (head!=null){

            if(originals.contains(head)){

                return true;

            }

            originals.add(head);

            head = head.next;

        }

        return false;

    }

    public static boolean hasCycleSlowFast(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(slow!=null && fast!=null && fast.next!=null){

            slow = slow.next;

            fast = fast.next.next;

            if(slow==fast){

                return true;

            }

        }

        return false;

    }

    public boolean hasCycleFlagField(ListNode head){
        return false;
    }
}

public class detectLoop {
    public static void main(String[] args) {

    }
}
