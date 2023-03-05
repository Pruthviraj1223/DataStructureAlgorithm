package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BT_A9_WidthOfTree {

    static class Pair {

        int index;
        TreeNode node;

        Pair(TreeNode node, int index) {
            this.index = index;
            this.node = node;

        }
    }

    public int widthOfBinaryTree(TreeNode root) {

        int ans = 0;

        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {

            int size = queue.size();
            int first = 0;
            int last = 0;

            for (int index = 0; index < size; index++) {

                var node = queue.peek().node;
                var idx = queue.peek().index;

                if (index == 0) {
                    first = idx;
                }

                if (index == size - 1) {
                    last = idx;
                }


                if (node.left != null) {
                    queue.offer(new Pair(node.left, 2 * idx + 1));
                }

                if (node.right != null) {
                    queue.offer(new Pair(node.right, 2 * idx + 2));

                }

                queue.poll();
            }

            ans = Math.max(ans, last - first + 1);

        }

        return ans;
    }

    public static void main(String[] args) {

        //https://leetcode.com/problems/maximum-width-of-binary-tree/submissions/

    }
}
