import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class InvertAndFlipMatrixTest {
  InvertAndFlipMatrix underTest;

  @BeforeEach
  void setup() {
    underTest = new InvertAndFlipMatrix();
  }

  @Test
  public void zeroArray() {
    int[][] matrix = {{0}};
    int[][] expected = {{1}};
    Assertions.assertArrayEquals(expected, underTest.flipAndInvert(matrix));
  }

//  @Test
//  public void twoElementArray() {
//    int[][] matrix = {{1}, {0}};
//    int[][] expected = {{0}, {1}};
//    Assertions.assertArrayEquals(expected, underTest.flipAndInvert(matrix));
//  }
//
//  @Test
//  public void twoByTwo() {
//    int[][] matrix = {{1, 1}, {0, 0}};
//    int[][] expected = {{0, 0}, {1, 1}};
//    Assertions.assertArrayEquals(expected, underTest.flipAndInvert(matrix));
//  }
//
//  @Test
//  public void threeByThree() {
//    int[][] matrix = {{1, 1, 0}, {1, 0, 0}};
//    int[][] expected = {{1, 0, 0}, {1, 1, 0}};
//    System.out.println(Arrays.deepToString(underTest.flipAndInvert(matrix)));
//    Assertions.assertArrayEquals(expected, underTest.flipAndInvert(matrix));
//  }
}
