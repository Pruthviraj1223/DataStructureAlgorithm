package Tree;

import java.util.*;

public class BT_A5_TopOrderTraversal {

    public static List<Integer> topOrder(TreeNode root) {

        TreeMap<Integer, Integer> traversal = new TreeMap<>();
        Queue<VerticalTreeNode> queue = new LinkedList<>();

        queue.add(new VerticalTreeNode(root, 0, 0));            // here 'level' does not make sense

        while (!queue.isEmpty())
        {
            var curr = queue.poll();
            int vertical = curr.vertical;

            traversal.putIfAbsent(curr.vertical, curr.node.val);          // once first value is dumped then it is the final value for that vertical  // in vertical order we had another map for levels and queue for multiple nodes

            if (curr.node.left != null)
            {
                queue.add(new VerticalTreeNode(curr.node.left, vertical - 1, 0));
            }

            if (curr.node.right != null)
            {
                queue.add(new VerticalTreeNode(curr.node.right, vertical + 1, 0));
            }
        }

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry :traversal.entrySet())
        {
            result.add(entry.getValue());
        }

        return result;
    }

    public static void main(String[] args)
    {
        topOrder(Z_NodeUtil.insert(new int[]{1,2,3,4,5,6,7}));
    }
}
