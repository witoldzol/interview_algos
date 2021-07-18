public class TreeValidator {
  boolean isValidBST(Node root) {
    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;
    return validate(root, min, max);
  }

  private boolean validate(Node root, int min, int max) {
    if (root == null) return true;
    if (root.left != null) {
      if (root.left.data > root.data || root.left.data <= min) return false;
    }
    if (root.right != null) {
      if (root.right.data < root.data || root.right.data >= max) return false;
    }
    return validate(root.left, min, root.data) && validate(root.right, root.data, max);
  }
}
