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
    private List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        traverse(root);
        return list;
    }
    private void traverse(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}
// class Solution{
//     public List<Integer> preorderTraversal(TreeNode root){
//         List<Integer> preorder = new ArrayList<Integer>();
//         if(root == null) return preorder;
//         Stack<TreeNode> st = new Stack<TreeNode>();
//         st.push(root);
//         while(!st.isEmpty()){
//             root = st.pop();
//             preorder.add(root.val);
//             if(root.right != null){
//                 st.push(root.right);
//             }
//             if(root.left != null){
//                 st.push(root.left);
//             }
//         }
//         return preorder;
//     }
// }
// we did right first left later because in stack last in first out 
// so left will come out first , as needed for preorder