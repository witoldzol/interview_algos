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
    ArrayList<Node> pv1 = traverse(root, v1, p1);
    ArrayList<Node> pv2 = traverse(root, v2, p2);
    int maxLen = pv1.size() <= pv2.size() ? pv1.size() : pv2.size();

    for (int i = maxLen - 1; i >= 0; i--) {
      for (int j = maxLen - 1; j >= 0; j--) {
        if (pv1.get(i) == pv2.get(j)) return pv1.get(i);
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
