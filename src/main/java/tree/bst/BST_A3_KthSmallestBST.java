package tree.bst;

public class BST_A3_KthSmallestBST {

    int count = 0;
    int result = Integer.MIN_VALUE;

    public void traverse(TreeNode root, int k) {

        if(root == null) return;

        traverse(root.left, k);

        count ++;

        if(count == k) result = root.val;

        traverse(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {

        traverse(root, k);
        return result;

    }

    public static void main(String[] args) {

    }
}
