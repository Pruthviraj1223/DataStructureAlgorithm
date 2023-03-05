package Tree;

public class BT_B8_CeilAndFloorOfBST {

    public static int Floor(TreeNode root,int val)
    {
        int floor = -1;

        while (root != null)
        {
            if (val > root.val)
            {
                floor = root.val;

                root = root.right;
            }
            else
            {
                root = root.left;
            }
        }

        return floor;
    }

    public static int Ceil(TreeNode root,int val)
    {
        int ceil = -1;

        while (root != null)
        {
            if (val > root.val)
            {
                root = root.right;
            }
            else
            {
                ceil = root.val;

                root = root.left;
            }
        }

        return ceil;
    }

    public static void main(String[] args) {

        // https://www.youtube.com/watch?v=KSsk8AhdOZA&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=42

        // ceil and floor's concept is very similar to binary search's ceil and floor.

    }
}
