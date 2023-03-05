
package Tree.BST;

import java.util.Stack;

class BSTIterator {

    Stack<TreeNode> stack = new Stack<>();

    BSTIterator(TreeNode root) {
        pushAllLeftNodes(root);
    }

    int next() {

        var node = stack.pop();

        if (node.right != null)
        {
            pushAllLeftNodes(node.right);
        }

        return node.val;
    }

    boolean hasNext() {
        return !stack.isEmpty();
    }

    void pushAllLeftNodes(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}


public class BST_A8_TreeIteratorBST {
    public static void main(String[] args) {

        // 1st approach is you store all inorder value in list and then perform next,hasNext operation.
        // TC :O(1) and SC : O(n)
        // to reduce space complexity we can follow above approach

        // understand the design first , code is nothing..

        BSTIterator iterator = new BSTIterator(Z_NodeUtil.insertBST(new int[]{10,7,5,8,2,9,1,15,13,14,18}));

        System.out.println(iterator.next());

        System.out.println(iterator.next());

        System.out.println(iterator.next());

        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());

        System.out.println(iterator.next());

        System.out.println(iterator.next());

        System.out.println(iterator.next());

        System.out.println(iterator.next());

        System.out.println(iterator.next());

        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());

    }
}
