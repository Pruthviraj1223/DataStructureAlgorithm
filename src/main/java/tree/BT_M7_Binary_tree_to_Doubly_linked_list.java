package tree;

public class BT_M7_Binary_tree_to_Doubly_linked_list {


    static TreeNode convertToDLL(TreeNode node)
    {
        if (node == null) return null;

        if (node.left != null)
        {
            // find the right most node in left subtree

            var left = convertToDLL(node.left);

            while (left.right != null)
            {
                left = left.right;
            }

            left.right = node;

            node.left = left;

        }

        if (node.right != null)
        {
            // find the right most node in left subtree

            var right = convertToDLL(node.right);

            while (right.left != null)
            {
                right = right.left;
            }

            right.left = node;

            node.right = right;

        }

        return node;

    }

    public static void main(String[] args) {

        // understand the theory first
        // make it so simple

    }
}
