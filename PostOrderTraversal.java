/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution
{
    public List<Integer> postorderTraversal(TreeNode root)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        postOrder(root, list);
        return list;
        
    }
    private void postOrder(TreeNode node, ArrayList<Integer> list)
    {
        if (node != null)
        {
            postOrder(node.left, list);
            postOrder(node.right, list);
            list.add(node.val);
        }
        else
            return;
    }
}
