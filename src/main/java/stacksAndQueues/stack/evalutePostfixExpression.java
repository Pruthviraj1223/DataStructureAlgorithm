package stacksAndQueues.stack;

import java.util.Stack;

class evaluate {
    public int evalRPN(String[] tokens) {

        int a,b;
        java.util.Stack<Integer> S = new Stack<>();

        for (String s : tokens) {
            switch (s) {
                case "+" -> S.add(S.pop() + S.pop());
                case "/" -> {
                    b = S.pop();
                    a = S.pop();
                    S.add(a / b);
                }
                case "*" -> S.add(S.pop() * S.pop());
                case "-" -> {
                    b = S.pop();
                    a = S.pop();
                    S.add(a - b);
                }
                default -> S.add(Integer.parseInt(s));
            }
        }
        return S.pop();


    }
}

public class evalutePostfixExpression {
    public static void main(String[] args) {

    }
}
