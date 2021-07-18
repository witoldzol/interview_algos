import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TreeValidatorTest {
  Node tree;
  TreeValidator validator;

  @BeforeEach
  void setUp() {
    validator = new TreeValidator();
  }

  @Test
  void returnTrueWhenRootNull() {
    assertTrue(validator.isValidBST(null));
  }

  @Test
  void returnTrueWhenLeftIsSmallerThanRoot() {
    tree = new Node(5);
    tree.left = new Node(3);
    assertTrue(validator.isValidBST(tree));
  }

  @Test
  void returnFalseWhenLeftIsBiggerThanRoot() {
    tree = new Node(5);
    tree.left = new Node(4);
    tree.left.left = new Node(7);
    assertFalse(validator.isValidBST(tree));
  }

  @Test
  void returnTrueWhenRightIsBiggerThanRoot() {
    tree = new Node(5);
    tree.right = new Node(7);
    assertTrue(validator.isValidBST(tree));
  }

  @Test
  void returnFalseWhenRightIsSmallerThanRoot() {
    tree = new Node(5);
    tree.right = new Node(6);
    tree.right.right = new Node(3);
    assertFalse(validator.isValidBST(tree));
  }
  @Test
  void returnTrueWhenValidTree() {
    tree = new Node(5);
    tree.left = new Node(4);
    tree.left.left = new Node(3);
    tree.left.left.left = new Node(2);
    tree.right = new Node(10);
    tree.right.left = new Node(7);
    tree.right.right = new Node(11);
    assertTrue(validator.isValidBST(tree));
  }
  @Test
  void returnFalseWhenInValidTree() {
    tree = new Node(5);
    tree.left = new Node(4);
    tree.left.left = new Node(3);
    tree.left.left.left = new Node(2);
    tree.right = new Node(10);
    tree.right.left = new Node(7);
    tree.right.right = new Node(3);
    assertFalse(validator.isValidBST(tree));
  }
  @Test
  void returnFalse(){
    tree = new Node(5);
    tree.left = new Node(4);
    tree.right = new Node(6);
    tree.right.left = new Node(3);
    tree.right.right = new Node(7);
    assertFalse(validator.isValidBST(tree));
  }
  @Test
  void returnTrueNegativeValues(){
    tree = new Node(-2147483648);
    tree.right = new Node(2147483647);
    assertTrue(validator.isValidBST(tree));
  }
}
