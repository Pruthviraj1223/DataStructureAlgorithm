package Tree;

public class LCAinBST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null)
        {
            return null;
        }

        int curr = root.val;

        if (p.val < curr && q.val < curr)
        {
            return lowestCommonAncestor(root.left,p,q);
        }

        if (p.val > curr && q.val > curr)
        {
            return lowestCommonAncestor(root.right,p,q);
        }

        return root;                    // the moment nodes are getting split from common point , that will be our LCA node.

    }

    public static void main(String[] args) {

        // https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/submissions/

    }
}
