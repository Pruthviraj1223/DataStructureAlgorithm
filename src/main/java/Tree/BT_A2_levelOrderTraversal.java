package Tree;

import java.util.*;

public class BT_A2_levelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return result;
        }

        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();

            List<Integer> subList = new ArrayList<>();

            for (int index = 0; index < size; index++) {

                var node = queue.poll();

                if (node != null) {

                    if (node.left != null) {
                        queue.add(node.left);
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                    }

                    subList.add(node.val);
                }
            }

            result.add(subList);                                            // sublist is just for adding nodes level wise
        }

        return result;


    }

    public static void main(String[] args) {

    }
}
