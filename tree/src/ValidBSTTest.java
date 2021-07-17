import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidBSTTest {
  Node validTree;
  Node invalidTree;
  ValidBST validBST;

  @BeforeEach
  void setUp(){
    validBST = new ValidBST();

    validTree = new Node(6);
    validTree.left = new Node(4);
    validTree.right = new Node(7);
    validTree.left.left = new Node(2);
    validTree.left.right = new Node(5);

    invalidTree = new Node(5);
    invalidTree.left = new Node(7);
  }

  @Test
  void returnsTrueWhenValidTree(){
    assertTrue(validBST.isValidBST(validTree));
  }

  @Test
  void returnsFalseWhenIvalidTree(){
    assertFalse(validBST.isValidBST(invalidTree));
  }
}
