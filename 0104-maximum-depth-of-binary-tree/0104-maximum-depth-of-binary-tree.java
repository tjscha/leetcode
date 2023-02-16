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
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int maxDepth(TreeNode root) {
        
        Queue<TreeNode> parents = new LinkedList<>();
        Queue<TreeNode> children = new LinkedList<>();
        int height = 0;
        parents.add(root);
        
        while(!parents.isEmpty()){
            height++;
            
            while(!parents.isEmpty()){
                
                TreeNode x = parents.remove();
                //System.out.println(x.val);
                //System.out.println(height);
                
                
                try{
                    children.add(x.left);
                }catch(NullPointerException e){
                }
                
                try{
                    children.add(x.right);
                }catch(NullPointerException e){
                }
                
                       
            }
            
            while(!children.isEmpty()){
                parents.add(children.remove());
            }
        }
        height--;
        return height;
    }
}