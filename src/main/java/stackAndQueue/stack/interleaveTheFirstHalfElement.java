package stackAndQueue.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class interleave{
    public void interleaveTheHalfEleUsingStack(Queue<Integer> queue){

        Stack<Integer> stack = new Stack<>();
        int half = queue.size()/2;

        for (int index = 0; index < half; index++) {

            stack.push(queue.poll());

        }

        for (int index = 0; index < half; index++) {

            queue.add(stack.pop());

        }

        for (int idnex = 0; idnex < half; idnex++) {

            queue.add(queue.poll());

        }

        for (int index = 0; index < half; index++) {

            stack.push(queue.poll());

        }

        while (!stack.isEmpty()){

            queue.add(stack.pop());
            queue.add(queue.poll());

        }

    }

    public void interleaveTheHalfEleUsingQueue(Queue<Integer> queue){

        Queue<Integer> temp = new LinkedList<>();

        int half = queue.size() / 2;

        for (int index = 0; index < half; index++) {
            temp.add(queue.poll());
        }

        for (int index = 0; index < half; index++) {


            queue.add(temp.poll());
            queue.add(queue.poll());

        }

    }

}

public class interleaveTheFirstHalfElement {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        // using stack

        // 1 2 3 4 5 6 7 8 9 10

        // STACK :  1 2 3 4 5(T)

        // 6 7 8 9 10 5 4 3 2 1

        // 5 4 3 2 1 6 7 8 9 10

        // STACK : 5 4 3 2 1

        // 6 7 8 9 10           STACK : 5 4 3 2 1(T)
        // 7 8 9 10 1 6         STACK : 5 4 3 2(T)
        // 8 9 10 1 6 2 7       STACK : 5 4 3(T)
        // 9 10 1 6 2 7 3 8     STACK : 5 4 (T)
        // 10 1 6 2 7 3 8 4 9   STACK : 5 (T)
        // 1 6 2 7 3 8 4 9 5 10

        new interleave().interleaveTheHalfEleUsingStack(queue);

        // using queue would be as easy

        // Q : 1 2 3 4 5 6 7 8 9 10

        // Q : 6 7 8 9 10
        // Temp Q : 1 2 3 4 5

        // add Temp Q's front to Q at rear
        // add Q's front to Q at rear

        new interleave().interleaveTheHalfEleUsingQueue(queue);

    }
}
