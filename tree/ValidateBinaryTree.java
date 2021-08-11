class ValidateBinaryTree {
  public boolean validateBT(Node root) {
    long min = Long.MIN_VALUE;
    long max = Long.MAX_VALUE;
    return validate(root.left, min, root.val) && validate(root.right, root.val, max);
  }

  private boolean validate(Node node, long min, long max) {
    if (node == null) {
      return true;
    }
    if (node.val < min || node.val > max) {
      return false;
    }
    return validate(node.left, min, node.val) && validate(node.right, node.val, max);
  }
}
