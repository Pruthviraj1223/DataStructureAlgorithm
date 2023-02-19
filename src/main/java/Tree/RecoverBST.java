package Tree;

public class RecoverBST {

    static TreeNode first, last, middle, prev;

    static void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        if (prev != null && prev.val > root.val) {

            if (first == null) {

                first = prev;
                middle = root;

            } else {

                last = root;

            }
        }

        prev = root;

        inorder(root.right);

    }

    static void recoverTree(TreeNode root) {

        first = middle = last = null;

        prev = new TreeNode(Integer.MIN_VALUE);

        inorder(root);

        if (first != null && last != null) {

            var temp = first.val;

            first.val = last.val;

            last.val = temp;


        } else if (first != null && middle != null) {

            var temp = first.val;

            first.val = middle.val;

            middle.val = temp;

        }

    }

    public static void main(String[] args) {

        // https://leetcode.com/problems/recover-binary-search-tree/

        // understand the concept first.

    }
}
