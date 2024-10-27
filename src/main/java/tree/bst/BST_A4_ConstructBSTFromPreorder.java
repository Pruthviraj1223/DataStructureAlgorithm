package tree.bst;

public class BST_A4_ConstructBSTFromPreorder {

    public TreeNode constructTree(int[] pre, int bound, int []index)
    {
        // bound is value of parent

        if (index[0]==pre.length || pre[index[0]] > bound)
        {
            return null;
        }

        TreeNode root = new TreeNode(pre[index[0]]);
        index[0]++;

        // first check from root's value
        // if it's bigger than it then check from parent value(bound)

        root.left = constructTree(pre,root.val,index);
        root.right = constructTree(pre,bound,index);

        return root;

    }

    public TreeNode bstFromPreorder(int[] preorder) {

        // concept is important. Understand the theory first.

        // always remember why we use array of one size instead of using single variable

        int[] index = new int[]{0};
        return constructTree(preorder,Integer.MAX_VALUE,index);

    }

    public static void main(String[] args) {

        // simple approach same as Binary Tree

        // but this one is more efficient


    }
}
