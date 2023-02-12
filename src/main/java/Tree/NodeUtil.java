package Tree;

class TreeNode {

    int val;
    TreeNode left, right;

    TreeNode(int val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class NodeUtil {


    static TreeNode insert(int[] values) {

        TreeNode root = new TreeNode(values[0], null, null);

        root.left = new TreeNode(values[1], null, null);

        root.right = new TreeNode(values[2], null, null);

        root.left.left = new TreeNode(values[3], null, null);

        root.left.right = new TreeNode(values[4], null, null);

        root.right.left = new TreeNode(values[5], null, null);

        root.right.right = new TreeNode(values[6], null, null);

        return root;

    }

    public static void insertBST(int []data)
    {
        TreeNode root = new TreeNode(data[0]);

        for (int index = 1; index < data.length; index++)
        {
            int currVal = data[index];

            TreeNode curr = root;

            while (true)
            {
                if (currVal < curr.val)
                {
                    if (curr.left == null)
                    {
                        curr.left = new TreeNode(currVal);
                        break;
                    }
                    else
                    {
                        curr = curr.left;
                    }
                }
                else
                {
                    if (curr.right == null)
                    {
                        curr.right = new TreeNode(currVal);
                        break;
                    }
                    else
                    {
                        curr = curr.right;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {

    }
}
