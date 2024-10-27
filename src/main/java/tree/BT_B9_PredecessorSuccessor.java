package tree;

public class BT_B9_PredecessorSuccessor {

    public static TreeNode Successor(TreeNode root,TreeNode target)
    {
        TreeNode successor = null;

        while (root != null)
        {
            if (target.val >= root.val)
            {
                root = root.right;
            }
            else
            {
                successor = root;

                root = root.left;
            }
        }

        return successor;
    }

    public static TreeNode Predecessor(TreeNode root,TreeNode target)
    {
        TreeNode predecessor = null;

        while (root != null)
        {
            if (target.val > root.val)
            {
                predecessor = root;

                root = root.right;
            }
            else
            {
                root = root.left;
            }
        }

        return predecessor;
    }

    public static void main(String[] args) {


        // it is exactly similar to ceil and floor

        // https://www.youtube.com/watch?v=SXKAD2svfmI&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=51

    }
}
