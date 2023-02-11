package Tree;

import java.util.*;

public class SerializeAndDeserialize {


    public static String serialize(TreeNode root)
    {
        Queue<TreeNode> queue = new LinkedList<>();

        StringBuilder stringBuilder = new StringBuilder();

        if (root == null) {
            return "";
        }

        queue.add(root);
        stringBuilder.append(root.val).append(",");

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int index = 0; index < size; index++) {

                var node = queue.poll();

                if (node != null) {

                    if (node.left != null) {
                        queue.add(node.left);
                        stringBuilder.append(node.left.val).append(",");
                    }
                    else
                    {
                        stringBuilder.append("#,");
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                        stringBuilder.append(node.right.val).append(",");
                    }
                    else {
                        stringBuilder.append("#,");
                    }
                }
            }
        }

        return stringBuilder.toString();

    }

    public static TreeNode deSerialize(String tree)
    {

        if (Objects.equals(tree, ""))
        {
            return null;
        }
        int index = 0;

        var arr = tree.split(",");

        TreeNode root = new TreeNode(Integer.parseInt(arr[index]));

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty())
        {
            int size = queue.size();

            for (int i = 0; i < size; i++)
            {
                var node = queue.poll();

                var leftChild = (2 * index) + 1;
                var rightChild = (2 * index) + 2;

                if (leftChild < arr.length &&  !arr[leftChild].equalsIgnoreCase("#"))
                {
                    node.left = new TreeNode(Integer.parseInt(arr[leftChild]));
                    queue.add(node.left);
                }

                if (rightChild < arr.length && !arr[rightChild].equalsIgnoreCase("#"))
                {
                    node.right = new TreeNode(Integer.parseInt(arr[rightChild]));
                    queue.add(node.right);
                }

                index++;
            }
        }

        return root;

    }

    public static void main(String[] args) {

        serialize(NodeUtil.insert(new int[]{1,2,3,-4,-5,6,7}));

        deSerialize(serialize(NodeUtil.insert(new int[]{1,2,3,-4,-5,6,7})));

    }
}
