import java.util.Scanner;

class TreeHight {

  public static int height(Node root) {
    return traverse(root, 0);
  }

  static int traverse(Node current, int depth) {
    if (current == null) return depth - 1;
    return Math.max(traverse(current.left, depth + 1), traverse(current.right, depth + 1));
  }

  public static Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    } else {
      Node cur;
      if (data <= root.data) {
        cur = insert(root.left, data);
        root.left = cur;
      } else {
        cur = insert(root.right, data);
        root.right = cur;
      }
      return root;
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    Node root = null;
    while (t-- > 0) {
      int data = scan.nextInt();
      root = insert(root, data);
    }
    scan.close();
    int height = height(root);
  }
}
