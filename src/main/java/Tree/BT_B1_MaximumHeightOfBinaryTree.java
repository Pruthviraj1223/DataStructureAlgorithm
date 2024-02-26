package Tree;

public class BT_B1_MaximumHeightOfBinaryTree {

    // Explanation : you go to the depth of tree, and then you backtrack from the leaf node and add left and right child.

    public int maxDepth(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }

        int lh = maxDepth(root.left);

        int rh = maxDepth(root.right);

        return 1 + Math.max(lh, rh);                            // here left subtree's height/depth + right subtree's height/depth + 1 (for node itself)
    }

    public static void main(String[] args) {

        // https://leetcode.com/problems/maximum-depth-of-binary-tree/

        // NOTE : This is the most fundamental question. So understand properly.

        // To understand depth and height of node .https://www.geeksforgeeks.org/height-and-depth-of-a-node-in-a-binary-tree/

        // A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

        // you can do with level order traversal as well
        // this solution is more efficient

        // check tree is self balanced or not is linked with this question

    }
}
