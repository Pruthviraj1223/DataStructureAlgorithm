package Tree;

import java.util.ArrayList;
import java.util.List;

public class BT_A7_RightLeftSideOfTree
{

    public List<Integer> rightSide(TreeNode node, List<Integer> result, int currDepth)
    {
        if (node == null)
        {
            return result;
        }

        if (currDepth == result.size())                     // must understand
        {
            result.add(node.val);
        }

        rightSide(node.right, result, currDepth + 1);                                       // just toggle this line , you'll get left side view

        rightSide(node.left, result, currDepth + 1);

        return result;

    }

    public List<Integer> rightSideView(TreeNode root)
    {
        List<Integer> result = new ArrayList<>();

        rightSide(root, result, 0);

        return result;
    }

    public static void main(String[] args)
    {
        // https://leetcode.com/problems/binary-tree-right-side-view/submissions/

    }
}
