package Stack_Queue.stack.recursion;

import java.util.Stack;

public class deleteMiddleElement {


    static Stack<Integer> stack = new Stack<>();
    static int n = 6;

    static void delete(){

        if(stack.size()==(n/2)+1){

            stack.pop();
            return;

        }

        int a = stack.pop();

        delete();

        stack.push(a);

    }

    public static void main(String[] args) {

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        deleteMiddleElement.delete();;

        System.out.println(stack);

    }
}
