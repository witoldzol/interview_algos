public class Matrix {
  char[][] arr;

  public Matrix(char[][] arr) {
    this.arr = arr;
  }

  boolean isEnd(int i, int j) {
    return this.arr[i][j] == 'C';
  }

  boolean isCoordinatesValid(int i, int j) {
    int maxI = this.arr.length;
    int maxJ = getMaxJ(i, maxI);
    return i >= 0 && i < maxI && j >= 0 && j < maxJ;
  }

  boolean isValidPath(int i, int j) {
    return (arr[i][j] == 'P' || arr[i][j] == 'S');
  }

  void markCellAsVisited(int i, int j) {
    arr[i][j] = 'V';
  }

  int calculateCrossroads(int i, int j) {
    int maxI = arr.length;
    int maxJ = getMaxJ(i, maxI);
    return getCrossroads(i, j, maxI, maxJ);
  }

  private int getMaxJ(int i, int maxI) {
    int maxJ = 0;
    if (i >= 0 && i < maxI) {
      maxJ = arr[i].length;
    }
    return maxJ;
  }

  private int getCrossroads(int i, int j, int maxI, int maxJ) {
    int paths = 0;
    paths = (ifValidPathBelow(i, j, maxI)) ? paths + 1 : paths;
    paths = (ifValidPathAbove(i, j)) ? paths + 1 : paths;
    paths = (ifValidPathLeft(i, j)) ? paths + 1 : paths;
    paths = (ifValidPathRight(i, j, maxJ)) ? paths + 1 : paths;
    return paths;
  }

  private boolean ifValidPathRight(int i, int j, int maxJ) {
    if (j + 1 < maxJ) {
      return (arr[i][j + 1] == 'C' || arr[i][j + 1] == 'P');
    }
    return false;
  }

  private boolean ifValidPathLeft(int i, int j) {
    if (j - 1 >= 0) {
      return (arr[i][j - 1] == 'C' || arr[i][j - 1] == 'P');
    }
    return false;
  }

  private boolean ifValidPathBelow(int i, int j, int maxI) {
    if (i + 1 < maxI) {
      return (arr[i + 1][j] == 'C' || arr[i + 1][j] == 'P');
    }
    return false;
  }

  private boolean ifValidPathAbove(int i, int j) {
    if (i - 1 >= 0) {
      return (arr[i - 1][j] == 'C' || arr[i - 1][j] == 'P');
    }
    return false;
  }
}

