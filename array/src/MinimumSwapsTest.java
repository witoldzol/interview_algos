import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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

  @Test
  void mergeSort() {
    int[] arr = {1};
    int[] expected = {1};
    int[] result = swaps.sort(arr);
    assertArrayEquals(expected, result);
  }

  @Test
  void mergeSortTwo() {
    int[] arr = {2, 1};
    int[] expected = {1, 2};
    int[] result = swaps.sort(arr);
    assertArrayEquals(expected, result);
  }

  @Test
  void mergeSortThree() {
    int[] arr = {2, 1, 3};
    int[] expected = {1, 2, 3};
    int[] result = swaps.sort(arr);
    assertArrayEquals(expected, result);
  }

  @Test
  void mergeSortFour() {
    int[] arr = {4, 2, 1, 3};
    int[] expected = {1, 2, 3, 4};
    int[] result = swaps.sort(arr);
    assertArrayEquals(expected, result);
  }
}
