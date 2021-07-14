import java.util.ArrayList;
import java.util.Scanner;

class Node {
  Node left;
  Node right;
  int data;

  Node(int data) {
    this.data = data;
    left = null;
    right = null;
  }
}

class Solution {

  /*
  class Node
      int data;
      Node left;
      Node right;
  */
  public static Node lca(Node root, int v1, int v2) {
    ArrayList<Node> p1 = new ArrayList<>();
    ArrayList<Node> p2 = new ArrayList<>();
    ArrayList<Node> pathToV1 = traverse(root, v1, p1);
    ArrayList<Node> pathToV2 = traverse(root, v2, p2);
    for (int i = 0; i < pathToV1.size(); i++) {
      for (int j = 0; j < pathToV2.size(); j++) {
        if (pathToV1.get(i) == pathToV2.get(j)) return pathToV1.get(i);
      }
    }
    return null;
  }

  static ArrayList<Node> traverse(Node curr, int target, ArrayList<Node> path) {
    if (curr == null) return null;
    path.add(curr);
    if (curr.data == target) return path;
    ArrayList<Node> left = traverse(curr.left, target, path);
    ArrayList<Node> right = traverse(curr.right, target, path);
    if (left != null) return left;
    return right;
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
