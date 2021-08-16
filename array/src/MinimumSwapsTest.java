import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumSwapsTest {
  @Test
  void oneSwap(){
    int[] arr = {2,1};
    MinimumSwaps swaps = new MinimumSwaps(arr);
    int result = swaps.calculate();
    assertEquals(1, result);
  }

}
