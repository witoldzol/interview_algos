import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidBSTTest {
  Node validRoot;
  ValidBST validBST;
  @BeforeEach
  void setUp(){
    validBST = new ValidBST();

    validRoot = new Node(6);
    validRoot.left = new Node(4);
    validRoot.right = new Node(7);
    validRoot.left.left = new Node(2);
    validRoot.left.right = new Node(5);
  }

  @Test
  void returnsTrueWhenValidTree(){
    assertTrue(validBST.isValidBST(validRoot));
  }

}
