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

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack* obj = new MyStack();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->top();
 * bool param_4 = obj->empty();
 */

public class queueImplementUsingStack {
    public static void main(String[] args) {

        MyStack myStack = new MyStack();

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
