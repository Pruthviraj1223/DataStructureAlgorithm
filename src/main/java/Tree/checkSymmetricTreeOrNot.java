package Tree;

public class checkSymmetricTreeOrNot {

    public boolean check(TreeNode left, TreeNode right) {

        if (left == null || right == null) {
            return left == right;
        }

        if (left.val != right.val) {
            return false;
        }

        return (check(left.left, right.right) && check(left.right, right.left));

    }

    public boolean isSymmetric(TreeNode root) {

        return (root == null || check(root.left, root.right));

    }

    public static void main(String[] args) {


        // theory is to check
        // on left side : root left right
        // on right side : root right left

        // visualize proper

        // check mirror

    }
}
