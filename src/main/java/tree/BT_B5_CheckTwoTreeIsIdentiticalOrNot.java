package tree;

public class BT_B5_CheckTwoTreeIsIdentiticalOrNot {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null || q == null) {
            return (p == q);
        }

        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {

        //https://leetcode.com/problems/same-tree/submissions/

    }
}
