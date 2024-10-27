package tree;

import java.util.HashMap;
import java.util.Map;

public class BT_C1_ConstructTreeFromPostorderInorder {

    public static TreeNode buildTree(Map<Integer, Integer> inOrderIndexes, int[] postOrder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd) {

        if (postStart > postEnd || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(postOrder[postEnd]);

        int rootIndex = inOrderIndexes.get(root.val);

        int numsLeft = rootIndex - inStart;

        root.left = buildTree(inOrderIndexes, postOrder, postStart , postStart + numsLeft - 1, inorder, inStart, rootIndex - 1);

        root.right = buildTree(inOrderIndexes, postOrder, postStart + numsLeft, postEnd-1, inorder, rootIndex+1, inEnd);

        return root;

    }


    public TreeNode buildTree(int[] inorder, int[] postorder) {

        Map<Integer, Integer> indexes = new HashMap<>();

        for (int index = 0; index < inorder.length; index++) {
            indexes.put(inorder[index], index);
        }

        return buildTree(indexes, postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1);

    }

    public static void main(String[] args) {

        // https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/submissions/

        // concept is important

        // understand first preorder question and then here you just need to understand the parameter

    }
}
