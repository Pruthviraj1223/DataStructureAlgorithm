package Tree;

import java.util.*;

public class levelOrderTraversal {

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

                if (queue.size() > 0 && queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }

                if (queue.size() > 0 && queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }

                subList.add(Objects.requireNonNull(queue.poll()).val);
            }
            result.add(subList);
        }

        return result;


    }

    public static void main(String[] args) {

    }
}
