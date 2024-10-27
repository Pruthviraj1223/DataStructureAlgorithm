package tree;

import java.util.*;
 class VerticalTreeNode
 {
    TreeNode node;
    int vertical;
    int horizontal;

    VerticalTreeNode(TreeNode node, int vertical, int horizontal)
    {
        this.node = node;

        this.vertical = vertical;

        this.horizontal = horizontal;
    }

}

public class BT_A4_VerticalOrderTraversal {

    public static List<List<Integer>> vertical(TreeNode root)
    {

        // key -> vertical , value -> key -> horizontal ,value -> nodes

        // one vertical will have different horizontals.

        // Reason : we have used tree map because I need result from left to right ( - to + ) for vertical and for horizontal vise node ( up to down )

        // here tree structure is very important. because how we stored data is very important.

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> traversal = new TreeMap<>();

        Queue<VerticalTreeNode> queue = new LinkedList<>();

        queue.add(new VerticalTreeNode(root, 0, 0));

        while (!queue.isEmpty())
        {
            var curr = queue.poll();

            int vertical = curr.vertical;

            int level = curr.horizontal;

            if (!traversal.containsKey(vertical))
            {
                traversal.put(vertical, new TreeMap<>());
            }

            if (!traversal.get(vertical).containsKey(level))
            {
                traversal.get(vertical).put(level, new PriorityQueue<>());
            }

            traversal.get(vertical).get(level).add(curr.node.val);

            if (curr.node.left != null)
            {
                queue.add(new VerticalTreeNode(curr.node.left, vertical - 1, level + 1));
            }

            if (curr.node.right != null)
            {
                queue.add(new VerticalTreeNode(curr.node.right, vertical + 1, level + 1));
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for (TreeMap<Integer, PriorityQueue<Integer>> levels : traversal.values())                              // traversing on diff. levels , vertical vise traversing
        {
            result.add(new ArrayList<>());

            // we are traversing from left to right , because its tree map, and we also need result in that way.

            for (PriorityQueue<Integer> nodes : levels.values())             // traversing on nodes ( total nodes on that level), level vise traversing
            {
                while (!nodes.isEmpty())
                {
                    result.get(result.size() - 1).add(nodes.poll());
                }
            }
        }

        return result;
    }

    public static void main(String[] args)
    {

        // https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/submissions/

        vertical(Z_NodeUtil.insert(new int[]{1,2,3,4,5,6,7}));

    }
}
