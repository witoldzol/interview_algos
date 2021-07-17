public class TreeValidator {
  boolean isValidBST(Node root){
    if(root == null) return true;
    if(root.left != null && root.left.data > root.data) return false;
    if(root.right != null && root.right.data < root.data) return false;
//    if(root.left.data > root.data) return false;
    return true;
  }
}
