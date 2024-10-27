package stackAndQueue.stack.recursion;

import java.util.LinkedList;
import java.util.Queue;

class reverseQ{

    Queue<Integer> queue = new LinkedList<>();

    void reverse(){

        if(queue.size()==0){
            return;
        }

        int a = queue.remove();

        reverse();

        queue.add(a);

    }



}

public class reverseQueue {
    public static void main(String[] args) {

        reverseQ r = new reverseQ();

        r.queue.add(1);
        r.queue.add(2);
        r.queue.add(3);
        r.queue.add(4);
        r.queue.add(5);

        r.reverse();

        System.out.println(r.queue);

    }
}
