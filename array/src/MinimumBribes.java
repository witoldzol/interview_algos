public class MinimumBribes {
  int calculate(int[] q) throws Exception {
    int counter = 0;
    for (int i = 0; i < q.length; i++) {
      if (isWithinBounds(i + 1, q)) {
        int outsideOriginalIndex = q[i] - (i + 1);
        if (outsideOriginalIndex > 0) {
          counter += outsideOriginalIndex;
        } else {
          if(q[i + 1] < q[i]){
            counter -= outsideOriginalIndex;
          }
        }
        if ((q[i] - (i+1)) > 2) {
          throw new Exception("Too Chaotic");
        }
      }
    }
    return counter;
  }

  private boolean isWithinBounds(int i, int[] q) {
    return (i >= 0) && (i < q.length);
  }
}
