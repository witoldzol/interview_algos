import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeSortTest {
  MergeSort mergeSort;

  @BeforeEach
  void setuUp() {
    mergeSort = new MergeSort();
  }

  @Test
  void mergeSort() {
    int[] arr = {1};
    int[] expected = {1};
    int[] result = mergeSort.sort(arr);
    assertArrayEquals(expected, result);
  }

  @Test
  void mergeSortTwo() {
    int[] arr = {2, 1};
    int[] expected = {1, 2};
    int[] result = mergeSort.sort(arr);
    assertArrayEquals(expected, result);
  }

  @Test
  void mergeSortThree() {
    int[] arr = {2, 1, 3};
    int[] expected = {1, 2, 3};
    int[] result = mergeSort.sort(arr);
    assertArrayEquals(expected, result);
  }

  @Test
  void mergeSortFour() {
    int[] arr = {4, 2, 1, 3};
    int[] expected = {1, 2, 3, 4};
    int[] result = mergeSort.sort(arr);
    assertArrayEquals(expected, result);
  }

}
