/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public void leaf(TreeNode node,ArrayList<Integer> al)
    {
        if(node==null)
            return;
        if(node.left==null && node.right==null){
            al.add(node.val);
            return;
        }
        leaf(node.left,al);
        leaf(node.right,al);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) 
    {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        leaf(root1,l1);
        leaf(root2,l2);
        return l1.equals(l2);
    }
}