package Stack_Queue.stack.recursion;

import java.util.Stack;

class sort {

    Stack<Integer> stack = new Stack<>();

    public void insert(int x) {

        if (stack.size() == 0 || x > stack.peek()) {

            stack.push(x);

        } else {

            int a = stack.pop();

            insert(x);

            stack.push(a);

        }

    }

    public void sortStack() {

        if (stack.size() > 0) {

            int x = stack.pop();

            sortStack();

            insert(x);

        }

    }
}


public class sortStack {
    public static void main(String[] args) {

        sort r = new sort();

        r.stack.push(1);

        r.stack.push(5);

        r.stack.push(3);

        r.stack.push(4);

        r.stack.push(2);

        r.sortStack();

        // sort an array is exactly similar to this

        System.out.println(r.stack);

    }
}
