package Tree;

public class BT_B3_MaximumPathSumInTree {

    public int maxPathSum(TreeNode node, int[] d) {

        if (node == null) {
            return 0;
        }

        int leftVal = maxPathSum(node.left, d);
        int rightVal = maxPathSum(node.right, d);

        d[0] = Math.max(d[0], leftVal + rightVal + node.val);

        return node.val + Math.max(leftVal, rightVal);

    }

    public int maxSum(TreeNode root) {

        int[] d = new int[1];

        maxPathSum(root, d);

        return d[0];

    }

    public static void main(String[] args) {

        //https://leetcode.com/problems/binary-tree-maximum-path-sum/

        // here instead of calculating height we will calculate the sum

        // path sum and diameter question are similar

    }
}
