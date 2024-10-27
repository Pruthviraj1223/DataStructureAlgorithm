package tree;

public class BT_M1_LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // understand its theory concept first. Nothing in code.

        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null) {

            return right;

        } else if (right == null) {

            return left;

        } else {

            return root;

        }
    }

    public static void main(String[] args) {

        // https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

    }
}
