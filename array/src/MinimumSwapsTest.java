import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinimumSwapsTest {
  MinimumSwaps swaps;

  @BeforeEach
  void setuUp() {
    swaps = new MinimumSwaps();
  }

  @Test
  void oneSwap() {
    int[] arr = {2, 1};
    int result = swaps.calculate(arr);
    assertEquals(1, result);
  }

  @Test
  void oneSwap2() {
    int[] arr = {3, 2, 1};
    int result = swaps.calculate(arr);
    assertEquals(1, result);
  }

  @Test
  void twoSwaps() {
    int[] arr = {2, 3, 1};
    int result = swaps.calculate(arr);
    assertEquals(2, result);
  }

  @Test
  void twoSwap2() {
    int[] arr = {3, 1, 2};
    int result = swaps.calculate(arr);
    assertEquals(2, result);
  }
}
