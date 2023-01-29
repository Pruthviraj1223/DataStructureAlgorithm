package Tree;

import java.util.*;


public class VerticalOrderTraversal {

    static class VerticalTreeNode {

        TreeNode node;
        int x;
        int y;

        VerticalTreeNode(TreeNode node, int x, int y) {

            this.node = node;
            this.x = x;
            this.y = y;

        }

    }

    public static List<List<Integer>> vertical(TreeNode root) {

        // key -> vertical , value -> key -> level ,value -> nodes
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> traversal = new TreeMap<>();

        Queue<VerticalTreeNode> queue = new LinkedList<>();

        queue.add(new VerticalTreeNode(root, 0, 0));

        while (!queue.isEmpty()) {

            var node = queue.poll();

            int vertical = node.x;
            int level = node.y;

            if (!traversal.containsKey(vertical)) {
                traversal.put(vertical, new TreeMap<>());
            }

            if (!traversal.get(vertical).containsKey(level)) {
                traversal.get(vertical).put(level, new PriorityQueue<>());
            }

            traversal.get(vertical).get(level).add(node.node.val);

            if (node.node.left != null) {
                queue.add(new VerticalTreeNode(node.node.left, vertical - 1, level + 1));
            }

            if (node.node.right != null) {
                queue.add(new VerticalTreeNode(node.node.right, vertical + 1, level + 1));
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for (TreeMap<Integer, PriorityQueue<Integer>> levels : traversal.values()) {    // traversing on diff. levels

            result.add(new ArrayList<>());

            for (PriorityQueue<Integer> nodes : levels.values()) {                      // traversing on nodes ( total nodes on that level)

                while (!nodes.isEmpty()) {

                    result.get(result.size() - 1).add(nodes.poll());

                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/submissions/

        vertical(NodeUtil.insert(new int[]{1,2,3,4,5,6,7}));

    }
}
