package stacksAndQueues.stack.recursion;

import java.util.Stack;

class reverse{

    Stack<Integer> stack = new Stack<>();

    public void insertAtBottom(int x){

        if(stack.size()==0){
            stack.push(x);
        }else{

            int a = stack.pop();

            insertAtBottom(x);

            stack.push(a);

        }

    }

    public void reverseStck(){

        if(stack.size()>0){

            int x = stack.pop();

            reverseStck();

            insertAtBottom(x);

        }
        return;

    }
}


public class reverseStack {
    public static void main(String[] args) {

        reverse r = new reverse();
        r.stack.push(1);
        r.stack.push(2);
        r.stack.push(3);
        r.stack.push(4);
        r.stack.push(5);

        r.reverseStck();

    }
}
