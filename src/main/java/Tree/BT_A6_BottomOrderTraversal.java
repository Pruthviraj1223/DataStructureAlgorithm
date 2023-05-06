package Tree;

import java.util.*;

public class BT_A6_BottomOrderTraversal {

    public static List<Integer> BottomOrder(TreeNode root) {

        TreeMap<Integer, Integer> traversal = new TreeMap<>();
        Queue<VerticalTreeNode> queue = new LinkedList<>();

        queue.add(new VerticalTreeNode(root, 0, 0));            // here 'level' does not make sense

        while (!queue.isEmpty()) {

            var curr = queue.poll();

            traversal.put(curr.vertical, curr.node.val);          // only thing we have changed because we want to override it.        // we have used put here , and in top order we used putIfAbsent

            if (curr.node.left != null) {
                queue.add(new VerticalTreeNode(curr.node.left, curr.vertical - 1, 0));
            }

            if (curr.node.right != null) {
                queue.add(new VerticalTreeNode(curr.node.right, curr.vertical + 1, 0));
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
