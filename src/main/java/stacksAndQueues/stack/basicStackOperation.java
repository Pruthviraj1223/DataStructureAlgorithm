package stacksAndQueues.stack;

class Stack {

    int[] stack;

    int n;

    int top = -1;


    public Stack(int n) {

        this.n = n;

        stack = new int[n];

    }

    public int push(int element) {

        if (isFull()) {

            System.out.println("Stack is Full !!!!!");

            return -1;

        } else {

            stack[++top] = element;

        }

        System.out.println(element + " is pushed");

        return element;
    }

    public int pop() {


        if (isEmpty()) {

            System.out.println("Stack is Empty");

            return -1;

        } else {

            System.out.println(stack[top--] + " is popped");

            return 0;

        }

    }

    public void peek() {

        if (!isEmpty()) {

            System.out.println("Peek is : " + stack[top]);
        }else {

            System.out.println("No Peek Available");
        }


    }

    public boolean isFull() {

        return top == n-1;

    }


    public boolean isEmpty() {

        return top == -1;

    }


    public int size() {

        return n;

    }

    public void printStack(){

        System.out.println("stack elements is : ");

        for (int index = top; index >=0; index--) {

            System.out.println(stack[index] + " ");

        }

        System.out.println();


    }

}


public class basicStackOperation {
    public static void main(String[] args) {

        Stack stack = new Stack(6);

        stack.peek();

        stack.pop();

        stack.push(10);
        stack.push(13);
        stack.push(16);
        stack.push(20);
        stack.push(22);

        stack.peek();

        stack.pop();

        stack.pop();

        stack.push(100);

        stack.printStack();

        stack.push(10);
        stack.push(13);
        stack.push(16);
        stack.push(20);
        stack.push(22);


        System.out.println("JAVA STACK");

        java.util.Stack<Integer> javaStack = new java.util.Stack<>();

        javaStack.push(112);
        javaStack.push(113);
        javaStack.push(114);

        javaStack.pop();
        javaStack.peek();

        System.out.println("java stack : " + javaStack);


    }
}
