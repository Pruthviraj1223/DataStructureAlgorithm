package tree;

import java.util.HashMap;
import java.util.Map;

public class BT_C2_constructTreeFromPreorderInorder {

    public static TreeNode buildTree(Map<Integer, Integer> inOrderIndexes, int[] preOrder, int preStart, int preEnd, int inStart, int inEnd) {

        // IMP is parameter

        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preOrder[preStart]);

        int rootIndex = inOrderIndexes.get(root.val);

        int numsLeft = rootIndex - inStart;

        root.left = buildTree(inOrderIndexes, preOrder, preStart + 1, preStart + numsLeft, inStart, rootIndex - 1);

        root.right = buildTree(inOrderIndexes, preOrder, preStart + numsLeft + 1, preEnd, rootIndex+1, inEnd);

        return root;

    }

    public static TreeNode constructTree(int[] preorder, int[] inorder) {

        Map<Integer, Integer> indexes = new HashMap<>();

        for (int index = 0; index < inorder.length; index++) {
            indexes.put(inorder[index], index);
        }

        return buildTree(indexes, preorder, 0, preorder.length - 1, 0, inorder.length - 1);

    }


    public static void main(String[] args) {

        // https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/submissions/

        // understand the concept

        int[] pre = new int[]{3,9,20,15,7};
        int[] in = new int[]{9,3,15,20,7};

        constructTree(pre,in);

    }
}
