package stacksAndQueues;

import java.util.Stack;

class MyQueue {
    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();

    public MyQueue() {

    }

    public void push(int x) {

        while(!s1.isEmpty()){

            s2.push(s1.pop());

        }

        s2.add(x);

        while(!s2.isEmpty()){

            s1.add(s2.pop());

        }


    }

    public int pop() {


        return s1.pop();

    }

    public int peek() {


        return s1.peek();

    }

    public boolean empty() {

        return s1.size()==0;

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

public class stackImplementUsingQueue {
    public static void main(String[] args) {


        MyQueue myQueue = new MyQueue();

        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);

        System.out.println("top " + myQueue.peek());

        System.out.println("pop " + myQueue.pop());

        myQueue.pop();
        myQueue.pop();


        System.out.println("top " + myQueue.peek());

        System.out.println("pop " + myQueue.pop());


    }
}
