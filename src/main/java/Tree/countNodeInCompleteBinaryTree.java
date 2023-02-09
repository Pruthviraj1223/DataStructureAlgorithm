package Tree;

public class countNodeInCompleteBinaryTree {

    public static int getLeft(TreeNode root) {
        int count = 0;

        while (root.left != null) {
            count++;
            root = root.left;

        }
        return count;
    }

    public static int getRight(TreeNode root) {
        int count = 0;

        while (root.right != null) {
            count++;
            root = root.right;

        }
        return count;
    }

    public int countNodes(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int lh = getLeft(root);
        int rh = getRight(root);

        if (lh == rh) {
            return ((2 << (lh)) - 1);
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }

    }

    public static void main(String[] args) {

        // theory/concept is important

        //https://leetcode.com/problems/count-complete-tree-nodes/submissions/

    }
}
