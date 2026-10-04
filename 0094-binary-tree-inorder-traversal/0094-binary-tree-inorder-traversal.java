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
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return list;
    }
    private void traverse(TreeNode root){
        if(root == null){
            return;
        }
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }
}
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root){
//         List<Integer> inorder = new ArrayList<Integer>();
//         Stack<TreeNode> st = new Stack<TreeNode>();
//         TreeNode node = root;
//         while(true){
//             if(node != null){
//                 st.push(node);
//                 node = node.left;
//             }
//             else{
//                 if(st.isEmpty()){
//                     break;
//                 }
//                 node = st.pop();
//                 inorder.add(node.val);
//                 node = node.right;
//             }
//         }
//         return inorder;
        
//     }
// }