package tree;

public class BT_B4_DiameterOfTree {

    public int maxDiameter(TreeNode root, int[] d) {

        // understand the concept of diameter

        if (root == null) {
            return 0;
        }

        int leftHeight = maxDiameter(root.left, d);
        int rightHeight = maxDiameter(root.right, d);

        d[0] = Math.max(d[0], leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);

    }

    public int diameter(TreeNode root) {

        int[] d = new int[1];

        maxDiameter(root, d);

        return d[0];

    }

    public static void main(String[] args) {

        //https://leetcode.com/problems/diameter-of-binary-tree/submissions/

        // here we are just taking the maximum of left and right height and adding it
        // because its diameter

    }
}
