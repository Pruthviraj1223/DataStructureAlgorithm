package Tree;

public class BT_M2_FlattenBinaryTreeToLinkedList {

    TreeNode prev = null;

    public void flattenRecursive(TreeNode root) {

        // This one is nice.

        if (root == null) {
            return;
        }

        flattenRecursive(root.right);
        flattenRecursive(root.left);

        root.right = prev;
        root.left = null;

        prev = root;

    }

    public void flatten(TreeNode root) {

        // this one is pretty traditional.

        TreeNode curr = root;

        while (curr != null) {

            if (curr.left != null) {

                TreeNode node = curr.left;

                while (node.right != null) {
                    node = node.right;
                }

                node.right = curr.right;

                curr.right = curr.left;

                curr.left = null;

            }

            curr = curr.right;

        }
    }

    public static void main(String[] args) {

        // https://leetcode.com/problems/flatten-binary-tree-to-linked-list/submissions/

        // both solutions are very good.

    }
}
