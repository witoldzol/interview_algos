public class InvertAndFlipMatrix {
  public int[][] flipAndInvert(int[][] matrix) {
    return invert(matrix);
  }

  private int[][] invert(int[][] matrix) {
    int middle = matrix.length/2;
    for(int i=0;i<matrix.length;i++){
      for (int j = 0; j<middle; j++) {
        matrix[i][j] = (matrix[i][j] == 0) ? 1 : 0;
      }
    }
    return matrix;
  }
}
