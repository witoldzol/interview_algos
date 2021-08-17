public class MinimumSwaps {
  public int calculate(int[] arr) {
    return 1;
  }

  int[] merge(int[] arr) {
    if(arr.length==1) return arr;

    int[] left = new int[arr.length/2];
    int[] right = new int[arr.length-(arr.length/2)];
    for (int i = 0; i < arr.length / 2; i++) {
      left[i] = arr[i];
    }
    for (int i = arr.length/2; i < arr.length; i++) {
      right[i] = arr[i];
    }
    return sort(left,right);
  }

  private int[] sort(int[] left, int[] right) {
    return new int[0];
  }
}
