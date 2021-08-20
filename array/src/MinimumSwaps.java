public class MinimumSwaps {
  public int calculate(int[] arr) {
    return 1;
  }

  int[] sort(int[] arr) {
    if (arr.length < 2) {
      return arr;
    }
    int middle = arr.length / 2;
    //temp arrays
    int[] left = new int[middle];
    int[] right = new int[arr.length - middle];
    //copy arrays
    System.arraycopy(arr, 0, left, 0, middle);
    System.arraycopy(arr, middle, right, 0, arr.length - middle);

    left = sort(left);
    right = sort(right);

    return merge(left, right);
  }

  private int[] merge(int[] left, int[] right) {
    int len = left.length + right.length;
    int[] newArr = new int[len];
    int i = 0, j = 0, index = 0;

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        newArr[index] = left[i];
        i++;
      } else {
        newArr[index] = right[j];
        j++;
      }
      index++;
    }
    System.arraycopy(left, i, newArr, index, left.length - i);
    System.arraycopy(right, j, newArr, index, right.length - j);
    return newArr;
  }

}
