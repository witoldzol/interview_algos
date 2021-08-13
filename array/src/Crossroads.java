public class Crossroads {
  int getMax(int i, int j, Matrix m) {
    return visit(i, j, m, 0);
  }

  int visit(int i, int j, Matrix m, int crossroads) {
    if (isCoordinatesValid(i, j, m)) {
      if (isEnd(m.getArr()[i][j])) {
        return crossroads;
      }
      if (!isValidPath(m.getArr()[i][j])) {
        return crossroads;
      }
      markCellAsVisited(i, j, m);
      int p = calculateCrossroads(i, j, m);
      if (p == 0) {
        return 0;
      }
      if (p > 1) {
        crossroads += p - 1;
      }
      return Math.max(
          Math.max(goUp(i, j, m, crossroads), goDown(i, j, m, crossroads)),
          Math.max(goRight(i, j, m, crossroads), goLeft(i, j, m, crossroads)
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

  int goLeft(int i, int j, Matrix m, int crossroads) {
    return visit(i, j - 1, m, crossroads);
  }

  int goRight(int i, int j, Matrix m, int crossroads) {
    return visit(i, j + 1, m, crossroads);
  }

  int goUp(int i, int j, Matrix m, int crossroads) {
    return visit(i + 1, j, m, crossroads);
  }

  int goDown(int i, int j, Matrix m, int crossroads) {
    return visit(i - 1, j, m, crossroads);
  }

  private void markCellAsVisited(int i, int j, Matrix m) {
    m.getArr()[i][j] = 'V';
  }

  private boolean isCoordinatesValid(int i, int j, Matrix m) {
    int maxI = m.getArr().length;
    int maxJ = 0;
    if (i >= 0 && i < maxI) {
      maxJ = m.getArr()[i].length;
    }
    return i >= 0 && i < maxI && j >= 0 && j < maxJ;
  }

  int calculateCrossroads(int i, int j, Matrix m) {
    int maxI = m.getArr().length;
    int maxJ = 0;
    if (i >= 0 && i < maxI) {
      maxJ = m.getArr()[i].length;
    }
    int paths = 0;
    //above
    if (i - 1 >= 0) {
      if (m.getArr()[i - 1][j] == 'C' || m.getArr()[i - 1][j] == 'P') {
        paths += 1;
      }
    }
    //below
    if (i + 1 < maxI) {
      if (m.getArr()[i + 1][j] == 'C' || m.getArr()[i + 1][j] == 'P') {
        paths += 1;
      }
    }
    //left
    if (j - 1 >= 0) {
      if (m.getArr()[i][j - 1] == 'C' || m.getArr()[i][j - 1] == 'P') {
        paths += 1;
      }
    }
    //left
    if (j + 1 < maxJ) {
      if (m.getArr()[i][j + 1] == 'C' || m.getArr()[i][j + 1] == 'P') {
        paths += 1;
      }
    }
    return paths;
  }
}
