package tree.bst;

class NodeValue{
    int minValue;
    int maxValue;
    int size;

    NodeValue(int minValue,int maxValue,int size)
    {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.size = size;
    }
}

public class BST_A5_LargestBST {
    static NodeValue findLargestSize(TreeNode root)
    {
        if (root == null)
        {
            return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }

        var left = findLargestSize(root.left);
        var right = findLargestSize(root.right);

        if (left.maxValue < root.val && root.val < right.minValue)
        {
            return new NodeValue(Math.min(left.minValue,root.val),Math.max(right.maxValue,root.val), left.size + right.size + 1);
        }

        return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(left.size,right.size));
    }

    public static void main(String[] args) {

        // https://www.youtube.com/watch?v=X0oXMdtUDwo&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=54

        // concept is very important here.

    }
}
