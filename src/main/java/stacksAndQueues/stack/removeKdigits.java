package stacksAndQueues.stack;

import java.util.Stack;

class remove {

    public String removeDigits(String num, int k) {

        if (k == num.length()) {
            return "0";
        }

        if (k == 0) {
            return num;

        }

        Stack<Character> stack = new Stack<>();

        for (int index = 0; index < num.length(); index++) {

            char current = num.charAt(index);

            while (!stack.isEmpty() && k > 0 && stack.peek() > current) {

                stack.pop();

                k--;

            }

            if (!stack.isEmpty() || current != '0') {   // for non-leading zero number

                stack.push(current);

            }
        }

        while (!stack.isEmpty() && k > 0) {        // 1) when execution comes here number will be in increasing order for sure.  // 2) if number is 123456

            stack.pop();

            k--;

        }

        if (stack.isEmpty()) {      // if stack is empty then no need to build the result, return 0

            return "0";

        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {

            result.append(stack.pop());
        }

        return result.reverse().toString();

    }


}


public class removeKdigits {
    public static void main(String[] args) {

        new remove().removeDigits("10200",1);

    }
}
