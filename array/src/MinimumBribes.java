public class MinimumBribes {
  int calculate(int[] q) throws Exception {
    int bribes = 0;
    int expectedFirst = 1;
    int expectedSecond = 2;
    int expectedThird = 3;

    for (int value : q) {
      if (value == expectedFirst) {
        expectedFirst = expectedSecond;
        expectedSecond = expectedThird;
        expectedThird++;
      } else if (value == expectedSecond) {
        bribes++;
        expectedSecond = expectedThird;
        expectedThird++;
      } else if (value == expectedThird) {
        bribes += 2;
        expectedThird++;
      } else {
        throw new Exception("Too Chaotic");
      }
    }
    return bribes;
  }
}
