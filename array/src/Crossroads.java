public class Crossroads {
  int getMax(int i, int j, Matrix m) {
    return visit(i, j, m, 0);
  }

  int visit(int i, int j, Matrix m, int crossroads) {
    if (m.isCoordinatesValid(i, j)) {
      if (m.isEnd(i, j)) {
        return crossroads;
      }
      if (!m.isValidPath(i, j)) {
        return crossroads;
      }
      m.markCellAsVisited(i, j);
      int p = m.calculateCrossroads(i, j);
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
}
