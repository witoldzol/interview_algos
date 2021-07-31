import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    Assertions.assertArrayEquals(expected, underTest.invert(matrix));
  }

  @Test
  public void twoElementArray() {
    int[][] matrix = {{1}, {0}};
    int[][] expected = {{0}, {1}};
    Assertions.assertArrayEquals(expected, underTest.invert(matrix));
  }

  @Test
  public void twoByTwo() {
    int[][] matrix = {{1, 1}, {0, 0}};
    int[][] expected = {{0, 0}, {1, 1}};
    Assertions.assertArrayEquals(expected, underTest.invert(matrix));
  }

  @Test
  public void zeroArrayFlipped() {
    int[][] matrix = {{0}};
    int[][] expected = {{0}};
    Assertions.assertArrayEquals(expected, underTest.flip(matrix));
  }

  @Test
  public void twoElementArrayFlipped() {
    int[][] matrix = {{1, 0}, {0, 1}};
    int[][] expected = {{0, 1}, {1, 0}};
    Assertions.assertArrayEquals(expected, underTest.flip(matrix));
  }

  @Test
  public void twoByTwoFlipped() {
    int[][] matrix = {{1, 0}, {1, 0}};
    int[][] expected = {{0, 1}, {0, 1}};
    Assertions.assertArrayEquals(expected, underTest.flip(matrix));
  }

  @Test
  public void threeByThreeFlipped() {
    int[][] matrix = {{1, 0, 1}, {0, 1, 0}};
    int[][] expected = {{1, 0, 1}, {0, 1, 0}};
    Assertions.assertArrayEquals(expected, underTest.flip(matrix));
    matrix = new int[][]{{1, 1, 0}, {0, 0, 1}};
    expected = new int[][]{{0, 1, 1}, {1, 0, 0}};
    Assertions.assertArrayEquals(expected, underTest.flip(matrix));
  }

  @Test
  public void oneArrayFlipInvert() {
    int[][] matrix = {{1}};
    int[][] expected = {{0}};
    Assertions.assertArrayEquals(expected, underTest.flipAndInvert(matrix));
  }

  @Test
  public void twoArrayFlipInvert() {
    int[][] matrix = {{1, 0}, {1, 0}};
    int[][] expected = {{1, 0}, {1, 0}};
    Assertions.assertArrayEquals(expected, underTest.flipAndInvert(matrix));
  }

  @Test
  public void threeByThreeFlippedInvert() {
    int[][] matrix = {{1, 0, 1}, {0, 1, 0}};
    int[][] expected = {{0, 1, 0}, {1, 0, 1}};
    Assertions.assertArrayEquals(expected, underTest.flipAndInvert(matrix));
    matrix = new int[][]{{1, 1, 0}, {0, 0, 1}};
    expected = new int[][]{{1, 0, 0}, {0, 1, 1}};
    Assertions.assertArrayEquals(expected, underTest.flipAndInvert(matrix));
  }

}
