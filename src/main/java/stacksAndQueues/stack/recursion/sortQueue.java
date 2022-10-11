package stacksAndQueues.stack.recursion;

import java.util.LinkedList;

class QueueSort{

    java.util.Queue<Integer> queue = new LinkedList<>();

    public void frontToLast(int size){

        if(size==0){
            return;
        }

        queue.add(queue.remove());

        frontToLast(size-1);

    }

    public void insert(int x,int size){

        if(size==0){

            queue.add(x);
            return;
        } else if (!queue.isEmpty() && x <= queue.peek()) {

            queue.add(x);

            frontToLast(size);

        }else {

            queue.add(queue.remove());

            insert(x,size-1);

        }


    }

    public void queueSort(){

        if(queue.size()==0){
            return;
        }

        int temp = queue.remove();

        queueSort();

        insert(temp,queue.size());


    }
}


public class sortQueue {
    public static void main(String[] args) {

        QueueSort queueSort = new QueueSort();

        queueSort.queue.add(1);
        queueSort.queue.add(5);
        queueSort.queue.add(9);
        queueSort.queue.add(3);
        queueSort.queue.add(7);
        queueSort.queue.add(2);
        queueSort.queue.add(8);

        queueSort.queueSort();

        System.out.println(queueSort.queue);

    }

}
