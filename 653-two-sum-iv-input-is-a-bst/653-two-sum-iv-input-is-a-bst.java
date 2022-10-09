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
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>(); // Create set 
        return preorder(root, set, k);      // Perform preorder traversal
    }
    public boolean preorder(TreeNode root, Set<Integer> set, int k){
        if(root == null){ // If root is null 
            return false; // return false;
        }
        int countElement = k-root.val; // Calculate counter element 
        if(set.contains(countElement)){ // If set contains counter element 
            return true;                // return true;
        }
        set.add(root.val); // else add root element into set
        return preorder(root.left, set, k) || preorder(root.right, set, k); // Perform preorder traversal in the left and right child
    }
    
}