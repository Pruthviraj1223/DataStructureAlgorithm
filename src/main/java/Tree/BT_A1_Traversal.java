package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BT_A1_Traversal {

    // remember
    // when go in depth of any tree side, at that time you add node in stack
    // and when you backtrack you add node in the actual result

    public static void preOrder(TreeNode root) {
        // root -> left -> right

        if (root == null)
        {
            return;
        }

        System.out.println(root.val);

        preOrder(root.left);

        preOrder(root.right);

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

        if (root == null)
        {
            return;
        }

        inOrder(root.left);

        System.out.println(root.val);

        inOrder(root.right);

    }

    public static List<Integer>  inOrderIterative(TreeNode root) {
        // left -> root -> right

        List<Integer> result = new ArrayList<>();

        if (root == null)
        {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (true)
        {
            if (curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else
            {
                if (stack.isEmpty())
                {
                    break;
                }

                curr = stack.pop();

                result.add(curr.val);                                   // once you add the left most node then apply same philosophy in right node

                curr = curr.right;

            }
        }

        return result;

    }

    public static void postOrder(TreeNode root) {
        // left -> right -> root

        if (root == null)
        {
            return;
        }

        postOrder(root.left);

        postOrder(root.right);

        System.out.println(root.val);

    }

    public static List<Integer> postOrderIterativeUsingTwoStack(TreeNode root) {
        // left -> right -> root

        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        List<Integer> result = new ArrayList<>();

        // here as we have left right root
        // so in st2 we'll push first root then right(s) and then left(s)
        // so eventually in stack it will be left right root

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

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        stack.push(root);

        TreeNode curr = root;
        TreeNode temp;

        while (curr != null || !stack.isEmpty()) {

            if (curr != null) {                     // common important code // here you will go in depth of tree on left side to get left most node

                stack.push(curr);

                curr = curr.left;

            } else {

                temp = stack.peek().right;

                if (temp == null) {                          // you don't have right node , so now backtrack

                    temp = stack.pop();

                    result.add(temp.val);

                    while (stack.size() > 0 && temp == stack.peek().right) {                                // need to understand this condition,watch video of  striver. there is case when tree node has 5 right nodes like skewed tree. in that case this condition will occur.

                        temp = stack.pop();

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

        // 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

    }
}
