package tree;

public class BT_B10_Transform_to_sum_tree {

    public int maxPathSum(TreeNode node, int[] d) {

        if (node == null) {
            return 0;
        }

        int leftVal = maxPathSum(node.left, d);
        int rightVal = maxPathSum(node.right, d);

        int old = node.val;

        node.val = leftVal + rightVal;                              // at node, you just need left + right value

        return old + leftVal + rightVal;                            // but to propagate at root node we need old + left + right val

    }

    public int maxSum(TreeNode root) {

        int[] d = new int[1];

        maxPathSum(root, d);

        return d[0];

    }

    public static void main(String[] args) {
        //https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1
    }
}
