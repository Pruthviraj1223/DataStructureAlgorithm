package tree;

public class BT_B7_ChildSumProperty {

    public static void childSum(TreeNode root) {

        // first we propagate the value of root to children
        // then we propagate the sum of children to root

        if (root == null) {
            return;
        }

        int sum = 0;

        if (root.left != null) {

            sum += root.left.val;
        }

        if (root.right != null) {

            sum += root.right.val;

        }

        if (sum >= root.val) {

            root.val = sum;

        } else {

            if (root.left != null) {
                root.left.val = root.val;
            }

            if (root.right != null) {
                root.right.val = root.val;
            }
        }

        childSum(root.left);

        childSum(root.right);

        int total = 0;

        if (root.left != null) {
            total += root.left.val;
        }

        if (root.right != null) {
            total += root.right.val;
        }

        if (root.left != null || root.right != null) {
            root.val = total;
        }

    }

    public static void main(String[] args) {

        // https://www.youtube.com/watch?v=fnmisPM6cVo&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=30

    }
}
