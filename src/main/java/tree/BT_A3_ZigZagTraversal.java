package tree;

import java.util.*;

public class BT_A3_ZigZagTraversal {

    public List<List<Integer>> zigZag(TreeNode root){

        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return result;
        }

        queue.add(root);

        boolean leftToRight = true;

        while (!queue.isEmpty()) {

            int size = queue.size();

            List<Integer> subList = new ArrayList<>();

            for (int index = 0; index < size; index++) {

                var node = queue.poll();

                if (node != null) {

                    subList.add(node.val);

                    if (node.left != null) {
                        queue.add(node.left);
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                    }

                }
            }

            if (!leftToRight) {
                Collections.reverse(subList);
            }

            leftToRight = !leftToRight;

            result.add(subList);
        }

        return result;
    }

    public static void main(String[] args) {

        //https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/submissions/

        // similar to level order traversal

        // just need to introduce new variable  leftToRight.
        // which will keep track that in which direction we need to traverse

    }
}
