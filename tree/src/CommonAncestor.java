import java.util.Scanner;

class CommonAncestor {

  public static Node lca(Node root, int v1, int v2) {
    //if both values are bigger than current root node, we can move 'right'
    if (root.data < v1 && root.data < v2) {
      return lca(root.right, v1, v2);
    }
    //if both values are smaller than current root node, we can move 'left'
    if (root.data > v1 && root.data > v2) {
      return lca(root.left, v1, v2);
    }
    //if one value is bigger & other  smaller than root -> we have a common ancestor
    return root;
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
    int v1 = scan.nextInt();
    int v2 = scan.nextInt();
    scan.close();
    Node ans = lca(root, v1, v2);
    System.out.println(ans.data);
  }
}
