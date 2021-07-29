public class InvertAndFlipMatrix {
  public int[][] flipAndInvert(int[][] matrix) {
    return invert(matrix);
  }

  private int[][] invert(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      int middle = getMiddle(matrix[i]);

      for (int j = 0; j < middle; j++) {
        matrix[i][j] = (matrix[i][j] == 0) ? 1 : 0;
      }
    }
    return matrix;
  }

  private int getMiddle(int[] matrix) {
    return Math.max(1, matrix.length / 2);
  }
}
