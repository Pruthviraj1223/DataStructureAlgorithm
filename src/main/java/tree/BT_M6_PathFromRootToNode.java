package tree;

import java.util.ArrayList;
import java.util.List;

public class BT_M6_PathFromRootToNode {

    public boolean getPath(TreeNode node, List<Integer> result, int target) {

        if (node == null) {
            return false;
        }

        result.add(node.val);

        if (node.val == target) {
            return true;
        }

        if (getPath(node.left, result, target) || getPath(node.right, result, target)) {
            return true;
        }

        result.remove(result.size() - 1);

        return false;

    }


    public List<Integer> path(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        getPath(root, result, 7);

        return result;

    }

    public static void main(String[] args) {

        // aditya verma

    }
}
