package Tree;

import java.util.ArrayList;
import java.util.Collections;

public class BT_A8_BoundaryTraversal {

    // Explanation :
    // First add root value
    // 1. all left side ( don't include leaf node)
    // 2. all leaf node
    // 3. all right node ( don't include leaf node)


    // while traversing on the left side always check and add result from left side because we are traversing on boundary
    // if left is null then go for right side.
    // vice-versa for right side

    public static void traversalIterative(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();

        if (!isLeafNode(root)) {
            result.add(root.val);
        }

        getLeftNodes(root, result);

        getLeafNodes(root, result);

        getRightNode(root, result);

    }

    private static boolean isLeafNode(TreeNode node) {

        return (node.left == null && node.right == null);
    }

    private static void getLeftNodes(TreeNode node, ArrayList<Integer> result) {

        if (node == null) {
            return;
        }

        TreeNode current = node.left;

        while (current != null) {

            if (!isLeafNode(current))
            {
                result.add(current.val);
            }
            else
            {
                break;
            }

            // first check left side , if that is null then go for right side.

            if (current.left != null) {

                current = current.left;

            } else if (current.right != null) {

                current = current.right;

            }
        }
    }

    private static void getLeafNodes(TreeNode node, ArrayList<Integer> result) {

        if (isLeafNode(node)) {
            result.add(node.val);
        }

        if (node.left != null) {
            getLeafNodes(node.left, result);
        }

        if (node.right != null) {
            getLeafNodes(node.right, result);
        }

    }

    private static void getRightNode(TreeNode node, ArrayList<Integer> result) {

        if (node == null) {
            return;
        }

        TreeNode current = node.right;

        ArrayList<Integer> temp = new ArrayList<>();

        while (current != null) {

            if (!isLeafNode(current)) {
                temp.add(current.val);
            }
            else
            {
                break;
            }

            if (current.right != null) {

                current = current.right;

            } else if (current.left != null) {

                current = current.left;

            }
        }

        Collections.reverse(temp);

        result.addAll(temp);
    }


    public static void traversalRecursion(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();

        if (root == null){
            return;
        }

        result.add(root.val);

        printLeftNodes(root.left, result);

        printLeaves(root.left, result);

        printLeaves(root.right, result);

        printRightNodes(root.right, result);

    }

    private static void printLeftNodes(TreeNode node, ArrayList<Integer> result) {

        if (node == null) {
            return;
        }

        if (node.left != null) {

            result.add(node.val);

            printLeftNodes(node.left, result);

        } else if (node.right != null) {

            result.add(node.val);

            printLeftNodes(node.right, result);

        }

    }

    private static void printLeaves(TreeNode node, ArrayList<Integer> result) {

        // understand the use case

        if (node == null) {
            return;
        }

        printLeaves(node.left, result);

        if (isLeafNode(node))
        {
            result.add(node.val);
        }

        printLeaves(node.right, result);

    }

    private static void printRightNodes(TreeNode node, ArrayList<Integer> result) {

        if (node == null) {
            return;
        }

        if (node.right != null) {

            printRightNodes(node.right, result);

            result.add(node.val);                               // adding after

        } else if (node.left != null) {

            printRightNodes(node.left, result);

            result.add(node.val);                               // adding after

        }

        // here it's recursion so you don't have to reverse the list
        // we are adding after it so , it will get set up.

    }


    public static void main(String[] args) {

        //https://www.geeksforgeeks.org/boundary-traversal-of-binary-tree/

    }
}
