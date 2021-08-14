import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinimumBribesTest {
  @Test
  void zeroBribes() {
    MinimumBribes bribes = new MinimumBribes();
    int[] arr = {1, 2};
    int result = bribes.calculate(arr);
    assertEquals(0, result);
  }

  @Test
  void oneBribe() {
    MinimumBribes bribes = new MinimumBribes();
    int[] arr = {2, 1};
    int result = bribes.calculate(arr);
    assertEquals(1, result);
  }

  @Test
  void oneBribe2() {
    MinimumBribes bribes = new MinimumBribes();
    int[] arr = {1,3,2};
    int result = bribes.calculate(arr);
    assertEquals(1, result);
  }
  @Test
  void twoBribes() {
    MinimumBribes bribes = new MinimumBribes();
    int[] arr = {2,3,1};
    int result = bribes.calculate(arr);
    assertEquals(2, result);
  }
//  @Test
//  void twoBribes2() {
//    MinimumBribes bribes = new MinimumBribes();
//    int[] arr = {3,1,2};
//    int result = bribes.calculate(arr);
//    assertEquals(2, result);
//  }
//  @Test
//  void threeBribes() {
//    MinimumBribes bribes = new MinimumBribes();
//    int[] arr = {2,4,1,3};
//    int result = bribes.calculate(arr);
//    assertEquals(1, result);
//  }
}
