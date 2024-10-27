package tree;

import java.util.ArrayList;
import java.util.List;

public class BT_A10_MorrisTraversal {

    static List<TreeNode> preOrder(TreeNode root)
    {
        // root left right

        TreeNode curr = root;

        List<TreeNode> result = new ArrayList<>();

        while (curr != null)
        {
            if (curr.left == null)
            {
                result.add(curr);
                curr = curr.right;
            }
            else
            {
                TreeNode temp = curr.left;

                while (temp.right !=null && temp.right != curr)
                {
                    temp = temp.right;
                }

                if (temp.right == null)
                {
                    temp.right = curr;
                    result.add(curr);                           // only this line changed      // because we want first root then left and then right
                    curr = curr.left;

                }else {

                    temp.right = null;
                    curr = curr.right;

                }
            }

        }

        return result;

    }

    static List<TreeNode> inOrder(TreeNode root)
    {

        // left root right

        TreeNode curr = root;

        List<TreeNode> result = new ArrayList<>();

        while (curr != null)
        {
            if (curr.left == null)
            {
                result.add(curr);
                curr = curr.right;
            }
            else
            {
                TreeNode temp = curr.left;

                while (temp.right !=null && temp.right != curr)
                {
                    temp = temp.right;
                }

                if (temp.right == null)                             // here you create thread
                {
                    temp.right = curr;
                    curr = curr.left;

                }
                else
                {                                                   // here you remove thread

                    temp.right = null;
                    result.add(curr);
                    curr = curr.right;                               // at this moment you'll have added left and root

                }
            }

        }

        return result;

    }

    public static void main(String[] args) {

        // concept here is of threaded binary tree

        // where we don't need stack
        // Inorder traversal of a Binary tree can either be done using recursion or with the use of a auxiliary stack.
        // The idea of threaded binary trees is to make inorder traversal faster and do it without stack and without recursion.
        //  A binary tree is made threaded by making all right child pointers that would normally be NULL point to the inorder successor of the node (if it exists).

        // also look advantages:
        // https://www.geeksforgeeks.org/threaded-binary-tree/


        // important understand all use case

        //https://www.youtube.com/watch?v=80Zug6D1_r4&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=38

    }
}
