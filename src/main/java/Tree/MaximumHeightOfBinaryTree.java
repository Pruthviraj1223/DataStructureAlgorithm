package Tree;

public class MaximumHeightOfBinaryTree {
    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1 + Math.max(lh, rh);

    }

    public static void main(String[] args) {

        // A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

        // you can do with level order traversal as well
        // this solution is more efficient

    }
}
