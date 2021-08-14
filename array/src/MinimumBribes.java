public class MinimumBribes {
  int calculate(int[] q) {
    int counter = 0;
    int bribesSoFar = 0;
    for (int i = 0; i < q.length; i++) {
      if (isWithinBounds(i + 1, q)) {
        //curr (index + bribesSoFar) - (value -1)
//        if ((i + bribesSoFar - q[i] - 1) > 2) {
//          throw new Exception("Too Chaotic");
//        }
        counter += q[i] - (i + 1);

      }
    }
    return counter;
  }

  private boolean isWithinBounds(int i, int[] q) {
    return (i >= 0) && (i < q.length);
  }
}
