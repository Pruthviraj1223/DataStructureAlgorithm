package Tree;

public class InsertInBST {

    public static void insert(int []data)
    {
        Z_NodeUtil.insertBST(data);
    }

    public TreeNode insertRecursion(TreeNode root, int val)
    {
        // this just more elegant way

        if(root == null) return new TreeNode(val);

        if(root.val > val) root.left = insertRecursion(root.left, val);

        else root.right = insertRecursion(root.right, val);

        return root;
    }


    public static void main(String[] args) {

        insert(new int[]{10,5,13,7,12,6});

    }
}
