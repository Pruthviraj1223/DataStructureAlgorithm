package stacksAndQueues;

import java.util.Stack;

class MyQueue {
    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();

    public MyQueue() {

    }

    public void push(int x) {

        while (!s1.isEmpty()) {

            s2.push(s1.pop());

        }

        s2.add(x);

        while (!s2.isEmpty()) {

            s1.add(s2.pop());

        }


    }

    public int pop() {

        if (empty()) {
            System.out.println("Underlow");
        } else {

            return s1.pop();
        }
        return -1;

    }

    public int peek() {

        return s1.peek();

    }

    public boolean empty() {

        return s1.size() == 0;

    }
}

class queueUsingSingleStack {
    Stack<Integer> s1 = new Stack<>();

    public queueUsingSingleStack() {

    }

    public void push(int x) {

        s1.add(x);

    }

    public int pop() {

        // recursion

        if (empty()) {

            System.out.println("Underflow !!");

        } else if (s1.size() == 1) {

            System.out.println("removed element : " + s1.pop());

        } else {

            int x = s1.pop();

            pop();

            push(x);

        }

        return -1;

    }

    public void peek() {

        if (empty()) {

            System.out.println("Underflow !!");

        } else if (s1.size() == 1) {

            System.out.println("peek element : " + s1.peek());

        } else {

            int x = s1.pop();

            peek();

            push(x);

        }



    }

    public boolean empty() {

        return s1.size() == 0;

    }


}


public class queueImplementUsingStackk {
    public static void main(String[] args) {

        queueUsingSingleStack myQueue = new queueUsingSingleStack();

        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);

        myQueue.peek();

        System.out.println("Print : " + myQueue.s1);

        myQueue.pop();
        myQueue.pop();

        myQueue.peek();

        System.out.println("Print : " + myQueue.s1);

        myQueue.pop();
        myQueue.pop();

        myQueue.peek();
        System.out.println("Print : " + myQueue.s1 );




    }
}
