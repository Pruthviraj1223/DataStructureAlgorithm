package stacksAndQueues.stack;

import java.util.Stack;

class evaluate {
    public int evalRPN(String[] tokens) {

        int a,b;
        java.util.Stack<Integer> S = new Stack<>();

        for (String s : tokens) {
            switch (s) {
                case "+" -> S.push(S.pop() + S.pop());
                case "/" -> {
                    b = S.pop();
                    a = S.pop();
                    S.push(a / b);
                }
                case "*" -> S.push(S.pop() * S.pop());
                case "-" -> {
                    b = S.pop();
                    a = S.pop();
                    S.push(a - b);
                }
                default -> S.push(Integer.parseInt(s));
            }
        }
        return S.pop();


    }
}

public class evalutePostfixExpression {
    public static void main(String[] args) {

    }
}
