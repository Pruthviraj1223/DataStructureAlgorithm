package Tree;

import java.util.*;

public class TopOrderTraversal {

    public static List<Integer> TopOrder(TreeNode root) {

        Map<Integer, Integer> traversal = new TreeMap<>();
        Queue<VerticalTreeNode> queue = new LinkedList<>();

        queue.add(new VerticalTreeNode(root, 0, 0));            // here 'y' does not make sense

        while (!queue.isEmpty()) {

            var node = queue.poll();

            traversal.computeIfAbsent(node.x, k -> node.node.val);          // once first value is dumped then it is the final value for that vertical  // in vertical order we had another map for levels and queue for multiple nodes

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

        TopOrder(NodeUtil.insert(new int[]{1,2,3,4,5,6,7}));

    }
}
