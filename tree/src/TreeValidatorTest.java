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
    tree.left = new Node(7);
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
    tree.right = new Node(3);
    assertFalse(validator.isValidBST(tree));
  }
}
