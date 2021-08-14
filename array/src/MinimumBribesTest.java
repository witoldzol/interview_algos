import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MinimumBribesTest {
  @Test
  void zeroBribes() throws Exception {
    MinimumBribes bribes = new MinimumBribes();
    int[] arr = {1, 2};
    int result = bribes.calculate(arr);
    assertEquals(0, result);
  }

  @Test
  void oneBribe() throws Exception {
    MinimumBribes bribes = new MinimumBribes();
    int[] arr = {2, 1};
    int result = bribes.calculate(arr);
    assertEquals(1, result);
  }

  @Test
  void oneBribe2() throws Exception {
    MinimumBribes bribes = new MinimumBribes();
    int[] arr = {1, 3, 2};
    int result = bribes.calculate(arr);
    assertEquals(1, result);
  }

  @Test
  void twoBribes() throws Exception {
    MinimumBribes bribes = new MinimumBribes();
    int[] arr = {2, 3, 1};
    int result = bribes.calculate(arr);
    assertEquals(2, result);
  }

  @Test
  void twoBribes2() throws Exception {
    MinimumBribes bribes = new MinimumBribes();
    int[] arr = {3, 1, 2};
    int result = bribes.calculate(arr);
    assertEquals(2, result);
  }

  @Test
  void threeBribes() throws Exception {
    MinimumBribes bribes = new MinimumBribes();
    int[] arr = {2, 4, 1, 3};
    int result = bribes.calculate(arr);
    assertEquals(3, result);
  }

  @Test
  void fourBribes() throws Exception {
    MinimumBribes bribes = new MinimumBribes();
    int[] arr = {3, 1, 5, 2, 4};
    int result = bribes.calculate(arr);
    assertEquals(4, result);
  }

  @Test
  void sevenBribes() throws Exception {
    MinimumBribes bribes = new MinimumBribes();
    int[] arr = {1, 2, 5, 3, 7, 8, 6, 4};
    int result = bribes.calculate(arr);
    assertEquals(7, result);
  }

  @Test
  void tooChaotic() {
    MinimumBribes bribes = new MinimumBribes();
    int[] arr = {4, 2, 1, 3};
    assertThrows(Exception.class, () -> bribes.calculate(arr));
  }
}
