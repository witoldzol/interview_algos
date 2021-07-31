public class InvertAndFlipMatrix {
  public int[][] flipAndInvert(int[][] matrix) {
    return flip(invert(matrix));
  }

  public int[][] invert(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = (matrix[i][j] == 0) ? 1 : 0;
      }
    }
    return matrix;
  }

  private int getMiddle(int[] matrix) {
    return Math.max(1, matrix.length / 2);
  }

  public int[][] flip(int[][] matrix) {
    for(int i=0;i<matrix.length;i++){
      int mid = getMiddle(matrix[i]);
      for (int j = 0; j < mid; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][matrix[i].length-1-j];
        matrix[i][matrix[i].length-1-j] = temp;
      }
    }
    return matrix;
  }
}
