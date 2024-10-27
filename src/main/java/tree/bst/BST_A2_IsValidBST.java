package tree.bst;

public class BST_A2_IsValidBST {

    public long min = Long.MIN_VALUE;
    public long max = Long.MAX_VALUE;

    public boolean isValid(TreeNode root, long min, long max) {

        if (root == null) {
            return true;
        }

        if (root.val >= max || root.val <= min) {
            return false;
        }

        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);

    }

    public boolean isValidBST(TreeNode root) {

        return isValid(root, min, max);

    }

    public static void main(String[] args) {

        //https://leetcode.com/problems/validate-binary-search-tree/submissions/

    }
}
