package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Traversal {

    // remember
    // when go in depth of any tree side, at that time you add node in stack
    // and when you backtrack you add node in the actual result

    public static void preOrder(TreeNode root) {
        // root -> left -> right
    }

    public List<Integer> preOrderIterative(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        if (root == null) {
            return result;
        }

        stack.push(root);

        while (!stack.isEmpty()) {
            var node = stack.pop();

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }

            result.add(node.val);

        }

        return result;

    }

    public static void inOrder(TreeNode root) {
        // left -> root -> right
    }

    public static void inOrderIterative(TreeNode root) {
        // left -> root -> right
    }

    public static void postOrder(TreeNode root) {
        // left -> right -> root

    }

    public static List<Integer> postOrderIterativeUsingTwoStack(TreeNode root) {
        // left -> right -> root

        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        List<Integer> result = new ArrayList<>();

        st1.push(root);

        while (!st1.isEmpty()) {

            root = st1.pop();
            st2.push(root);

            if (root.left != null) {
                st1.push(root.left);
            }

            if (root.right != null) {
                st1.push(root.right);
            }

        }

        while (!st2.isEmpty()) {

            result.add(st2.pop().val);

        }

        return result;

    }

    public static List<Integer> postOrderIterativeUsingOneStack(TreeNode root) {


        // left -> right -> root

        Stack<TreeNode> st1 = new Stack<>();
        List<Integer> result = new ArrayList<>();

        st1.push(root);

        TreeNode curr = root;
        TreeNode temp;

        while (curr != null || !st1.isEmpty()) {

            if (curr != null) {                     // common important code // here you will go in depth of tree on left side

                st1.push(curr);

                curr = curr.left;

            } else {

                temp = st1.peek().right;

                if (temp == null) {                          // you don't have right node , so now backtrack

                    temp = st1.pop();

                    result.add(temp.val);

                    while (st1.size() > 0 && temp == st1.peek().right) {

                        temp = st1.pop();

                        result.add(temp.val);
                    }

                } else {

                    curr = temp;

                }
            }
        }

        return result;

    }

    public static void main(String[] args) {

        // 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

    }
}
