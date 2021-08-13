public class Crossroads {
  int getMax(int i, int j, char[][] arr) {
    return visit(i, j, arr, 0);
  }

  int visit(int i, int j, char[][] arr, int crossroads) {
    if (isCoordinatesValid(i, j, arr)) {
      if (isEnd(arr[i][j])) {
        return crossroads;
      }
      if (!isValidPath(arr[i][j])) {
        return crossroads;
      }
      markCellAsVisited(i, j, arr);
      int p = calculateCrossroads(i, j, arr);
      if (p == 0) {
        return 0;
      }
      if (p > 1) {
        crossroads += p - 1;
      }
      return Math.max(
          Math.max(goUp(i, j, arr, crossroads), goDown(i, j, arr, crossroads)),
          Math.max(goRight(i, j, arr, crossroads), goLeft(i, j, arr, crossroads)
          )
      );
    } else {
      return 0;
    }
  }

  boolean isEnd(char c) {
    return c == 'C';
  }

  boolean isValidPath(char c) {
    return (c == 'P' || c == 'S');
  }

  int goLeft(int i, int j, char[][] arr, int crossroads) {
    return visit(i, j - 1, arr, crossroads);
  }

  int goRight(int i, int j, char[][] arr, int crossroads) {
    return visit(i, j + 1, arr, crossroads);
  }

  int goUp(int i, int j, char[][] arr, int crossroads) {
    return visit(i + 1, j, arr, crossroads);
  }

  int goDown(int i, int j, char[][] arr, int crossroads) {
    return visit(i - 1, j, arr, crossroads);
  }

  private void markCellAsVisited(int i, int j, char[][] arr) {
    arr[i][j] = 'V';
  }

  private boolean isCoordinatesValid(int i, int j, char[][] arr) {
    int maxI = arr.length;
    int maxJ = 0;
    if (i >= 0 && i < maxI) {
      maxJ = arr[i].length;
    }
    return i >= 0 && i < maxI && j >= 0 && j < maxJ;
  }

  int calculateCrossroads(int i, int j, char[][] arr) {
    int maxI = arr.length;
    int maxJ = 0;
    if (i >= 0 && i < maxI) {
      maxJ = arr[i].length;
    }
    int paths = 0;
    //above
    if (i - 1 >= 0) {
      if (arr[i - 1][j] == 'C' || arr[i - 1][j] == 'P') {
        paths += 1;
      }
    }
    //below
    if (i + 1 < maxI) {
      if (arr[i + 1][j] == 'C' || arr[i + 1][j] == 'P') {
        paths += 1;
      }
    }
    //left
    if (j - 1 >= 0) {
      if (arr[i][j - 1] == 'C' || arr[i][j - 1] == 'P') {
        paths += 1;
      }
    }
    //left
    if (j + 1 < maxJ) {
      if (arr[i][j + 1] == 'C' || arr[i][j + 1] == 'P') {
        paths += 1;
      }
    }
    return paths;
  }
}
