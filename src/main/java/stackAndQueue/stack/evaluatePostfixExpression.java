package stackAndQueue.stack;

import java.util.Stack;

class evaluate {
    public int evalRPN(String[] tokens) {

        int a,b;

        java.util.Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {

            switch (s) {

                case "+" -> stack.push(stack.pop() + stack.pop());

                case "/" -> {

                    b = stack.pop();
                    a = stack.pop();

                    stack.push(a / b);

                }

                case "*" -> stack.push(stack.pop() * stack.pop());

                case "-" -> {

                    b = stack.pop();

                    a = stack.pop();

                    stack.push(a - b);
                }

                default -> stack.push(Integer.parseInt(s));

            }
        }
        return stack.pop();


    }
}

public class evaluatePostfixExpression {
    public static void main(String[] args) {

    }
}
