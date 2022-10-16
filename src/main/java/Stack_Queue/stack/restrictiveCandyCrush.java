package Stack_Queue.stack;

import java.util.Stack;


class Node {

    char ch;
    int cnt;

    public Node(char ch, int cnt) {

        this.cnt = cnt;
        this.ch = ch;

    }

}

class Candies {

    public String candyCrush(String name, int k) {

        java.util.Stack<Node> stack = new Stack<>();

        for (int index = 0; index < name.length(); index++) {

            char ch = name.charAt(index);

            if (stack.size() == 0) {

                stack.push(new Node(ch, 1));

                continue;

            }

            if (ch == stack.peek().ch) {

                var temp = stack.pop();

                temp.cnt = temp.cnt + 1;

                if (temp.cnt != k) {

                    stack.push(temp);
                }

            } else {

                stack.push(new Node(ch, 1));

            }
        }

        StringBuilder result = new StringBuilder();

        while (stack.size() > 0) {

            var temp = stack.pop();

            int cnt = temp.cnt;

            while (cnt-- > 0) {

                result.append(temp.ch);

            }

        }

        return result.reverse().toString();
    }

}

public class restrictiveCandyCrush {

    public static void main(String[] args) {

        var ans = new Candies().candyCrush("geegksforgeeks", 2);

        System.out.println("ans " + ans);

    }
}

