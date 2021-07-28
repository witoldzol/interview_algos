public class TreeValidator {
  boolean isValidBST(Node root) {
    //set min and max vals - use long if bigger number needed
    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;
    return validate(root, min, max);
  }

  private boolean validate(Node root, int min, int max) {
    if (root == null) return true;
    if (root.data <= min || root.data >= max) return false;
    return validate(root.left, min, root.data) && validate(root.right, root.data, max);
  }
}
