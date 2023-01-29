package Tree;

import java.util.*;

public class BottomOrderTraversal {

    public static List<Integer> BottomOrder(TreeNode root) {

        Map<Integer, Integer> traversal = new TreeMap<>();
        Queue<VerticalTreeNode> queue = new LinkedList<>();

        queue.add(new VerticalTreeNode(root, 0, 0));            // here 'y' does not make sense

        while (!queue.isEmpty()) {

            var node = queue.poll();

            traversal.put(node.x, node.node.val);          // only thing we have changed because we want to override it.

            if (node.node.left != null) {
                queue.add(new VerticalTreeNode(node.node.left, node.x - 1, 0));
            }

            if (node.node.right != null) {
                queue.add(new VerticalTreeNode(node.node.right, node.x + 1, 0));
            }
        }

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry :traversal.entrySet()){

            result.add(entry.getValue());

        }

        return result;
    }

    public static void main(String[] args) {

    }
}
