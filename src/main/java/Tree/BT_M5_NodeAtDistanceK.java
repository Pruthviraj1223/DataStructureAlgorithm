package Tree;

import java.util.*;

public class BT_M5_NodeAtDistanceK {

    public static void getParents(Map<TreeNode, TreeNode> parents, Map<TreeNode, Boolean> visited, TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        visited.put(root, false);

        while (!queue.isEmpty()) {
            var parent = queue.poll();

            if (parent.left != null) {
                queue.add(parent.left);
                parents.put(parent.left, parent);
                visited.put(parent.left, false);

            }

            if (parent.right != null) {
                queue.add(parent.right);
                parents.put(parent.right, parent);
                visited.put(parent.right, false);

            }
        }

    }

    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parents = new HashMap<>();

        HashMap<TreeNode, Boolean> visited = new HashMap<>();

        getParents(parents, visited, root);

        int currLevel = 0;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(target);

        visited.put(target, true);

        while (!queue.isEmpty()) {
            int size = queue.size();

            if (currLevel == k) {
                break;
            }

            for (int index = 0; index < size; index++) {
                var node = queue.poll();

                if (node.left != null && !visited.get(node.left)) {
                    queue.add(node.left);
                    visited.put(node.left, true);
                }

                if (node.right != null && !visited.get(node.right)) {
                    queue.add(node.right);

                    visited.put(node.right, true);
                }

                if (parents.get(node) != null && !visited.get(parents.get(node))) {
                    queue.add(parents.get(node));

                    visited.put(parents.get(node), true);
                }

            }

            currLevel++;

        }

        List<Integer> result = new ArrayList<>();

        queue.forEach(key -> result.add(key.val));

        return result;

    }

    public static void main(String[] args) {

        //https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/submissions/

        // First understand concept , Code is nothing.

        // https://www.youtube.com/watch?v=2r5wLmQfD6g&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=32

        // above one is minimum time to burn tree. exact this code. Only need to add one variable.

        var root = Z_NodeUtil.insert(new int[]{1, 2, 3, 4, 5, 6, 7});

        distanceK(root, root.left, 1);

    }
}
