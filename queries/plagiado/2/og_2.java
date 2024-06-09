public class SortNumbers {

  public static void sortAscending(int[] numbers) {
    // Sorts an array of integers in ascending order using bubble sort
    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = 0; j < numbers.length - i - 1; j++) {
        if (numbers[j] > numbers[j + 1]) {
          int temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] data = {5, 2, 8, 1, 3};
    sortAscending(data);
    System.out.println("Sorted numbers: ");
    for (int num : data) {
      System.out.print(num + " ");
    }
  }
}
