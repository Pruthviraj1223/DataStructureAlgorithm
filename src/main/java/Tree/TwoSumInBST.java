package Tree;

import java.util.Stack;
class TwoWayIterator {

    Stack<TreeNode> stack = new Stack<>();
    boolean left;

    TwoWayIterator(TreeNode root, boolean isLeft) {
        left = isLeft;
        pushAllNodes(root, isLeft);
    }

    int next() {

        var node = stack.pop();

        if (left && node.right != null) {

            pushAllNodes(node.right, true);
        }
        else if (!left && node.left != null)
        {
            pushAllNodes(node.left, false);
        }

        return node.val;
    }

    boolean hasNext() {
        return !stack.isEmpty();
    }

    void pushAllNodes(TreeNode node, boolean isLeft) {

        while (node != null) {

            stack.push(node);

            if (isLeft) {

                node = node.left;

            } else {
                node = node.right;
            }

        }
    }
}

public class TwoSumInBST {

    static boolean TwoSum(TreeNode root,int sum) {

        TwoWayIterator left = new TwoWayIterator(root, true);

        TwoWayIterator right = new TwoWayIterator(root, false);

        int l = left.next();

        int r = right.next();

        while (l < r) {

            if (l + r == sum) {

                return true;

            } else if (l + r < sum) {

                l = left.next();

            } else {

                r = right.next();

            }
        }

        return false;
    }


    public static void main(String[] args) {

        // basic approach is traverse inorder and then in list you perform two sum

        // here in the above approach we won't require the extra list

        TwoSum(Z_NodeUtil.insertBST(new int[]{10, 7, 5, 2, 9, 1, 15, 13, 14, 18}),9);

    }
}
