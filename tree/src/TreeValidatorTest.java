import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TreeValidatorTest {
  Node tree;
  TreeValidator validator;

  @BeforeEach
  void setUp(){
    validator = new TreeValidator();
  }
//  void setUp(){
//    validBST = new ValidBST();
//
//    validTree = new Node(6);
//    validTree.left = new Node(4);
//    validTree.right = new Node(7);
//    validTree.left.left = new Node(2);
//    validTree.left.right = new Node(5);
//
//    invalidTree = new Node(5);
//    invalidTree.left = new Node(7);
//  }

  @Test
  void returnTrueWhenRootNull(){
    assertTrue(validator.isValidBST(null));
  }

  @Test
  void returnTrueWhenLeftIsSmallerThanRoot(){
    tree = new Node(5);
    tree.left = new Node(3);
    assertTrue(validator.isValidBST(tree));
  }

//  @Test
//  void returnsFalseWhenIvalidTree(){
//    assertFalse(validBST.isValidBST(invalidTree));
//  }
}
