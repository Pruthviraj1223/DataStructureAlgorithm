package Tree;

import java.util.*;
 class VerticalTreeNode {

    TreeNode node;
    int x;
    int y;

    VerticalTreeNode(TreeNode node, int x, int y) {

        this.node = node;
        this.x = x;
        this.y = y;

    }

}

public class VerticalOrderTraversal {

    public static List<List<Integer>> vertical(TreeNode root) {

        // key -> vertical , value -> key -> level ,value -> nodes

        // one vertical will have different level

        // we have used tree map because I need result from left to right ( - to + ) for vertical and for level vise node ( up to down )

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> traversal = new TreeMap<>();

        Queue<VerticalTreeNode> queue = new LinkedList<>();

        queue.add(new VerticalTreeNode(root, 0, 0));

        while (!queue.isEmpty()) {

            var curr = queue.poll();

            int vertical = curr.x;
            int level = curr.y;

            if (!traversal.containsKey(vertical)) {
                traversal.put(vertical, new TreeMap<>());
            }

            if (!traversal.get(vertical).containsKey(level)) {
                traversal.get(vertical).put(level, new PriorityQueue<>());
            }

            traversal.get(vertical).get(level).add(curr.node.val);

            if (curr.node.left != null) {
                queue.add(new VerticalTreeNode(curr.node.left, vertical - 1, level + 1));
            }

            if (curr.node.right != null) {
                queue.add(new VerticalTreeNode(curr.node.right, vertical + 1, level + 1));
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for (TreeMap<Integer, PriorityQueue<Integer>> levels : traversal.values()) {    // traversing on diff. levels , vertical vise traversing

            result.add(new ArrayList<>());

            for (PriorityQueue<Integer> nodes : levels.values()) {                      // traversing on nodes ( total nodes on that level), level vise traversing

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
