public class SortData {

  public static void arrangeAscending(int[] values) {
    // Orders values in increasing order (similar functionality)
    for (int i = 0; i < values.length - 1; i++) {
      for (int j = 0; j < values.length - i - 1; j++) {
        if (values[j] > values[j + 1]) {
          int swap = values[j];
          values[j] = values[j + 1];
          values[j + 1] = swap;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] info = {5, 2, 8, 1, 3};
    arrangeAscending(info);
    System.out.println("Data arranged in ascending order: ");
    for (int val : info) {
      System.out.print(val + " ");
    }
  }
}
