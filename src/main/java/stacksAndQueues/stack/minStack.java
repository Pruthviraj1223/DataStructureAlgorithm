package stacksAndQueues.stack;

class MinStack {

    java.util.Stack<Integer> s = new java.util.Stack<>();
    java.util.Stack<Integer> ss = new java.util.Stack<>();

    public void push(int val) {

        s.push(val);

        if(ss.size()==0 || ss.peek()>=val){

            ss.push(val);

        }

    }

    public void pop() {

        int x = s.peek();

        s.pop();

        if(x==ss.peek()){

            ss.pop();

        }

    }

    public int top() {

        return s.peek();
    }

    public int getMin() {

        if(ss.isEmpty()){
            return -1;
        }

        return ss.peek();

    }
}

public class minStack {
    public static void main(String[] args) {

        // 1st with two stack -- this simple
        // 2nd with one stack -- here you need to remember the formula (2X-minElement)

    }
}
