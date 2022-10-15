package stacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    MyStack() {

        q1 = new LinkedList<>();
        q2 = new LinkedList<>();

    }

    void push(int x) {

        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }

        q1.add(x);

        while(!q2.isEmpty()){

            q1.add(q2.remove());

        }


    }

    int pop() {


        if(!empty()){
            return q1.remove();
        }

        return -1;

    }

    int top() {

        return q1.peek();

    }

    boolean empty() {

        return q1.size()==0;

    }
};

class MyStackUsingSingleQueue{

    Queue<Integer> q1;

    MyStackUsingSingleQueue() {

        q1 = new LinkedList<>();

    }

    void push(int x) {

        int n = q1.size();

        q1.add(x);

        for (int index = 0; index < n; index++) {

            q1.add(q1.poll());

        }

    }

    int pop() {


        if(!empty()){
            return q1.remove();
        }

        return -1;

    }

    int top() {

        return q1.peek();

    }

    boolean empty() {

        return q1.size()==0;

    }



}
public class stackImplementUsingQueue {
    public static void main(String[] args) {

        MyStackUsingSingleQueue myStack = new MyStackUsingSingleQueue();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println("top " + myStack.top());

        System.out.println("pop " + myStack.pop());


        myStack.push(4);
        myStack.push(5);


        System.out.println("top " + myStack.top());

        System.out.println("pop " + myStack.pop());



    }
}
