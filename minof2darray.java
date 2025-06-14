import java.util.Arrays;

public class minof2darray {
  public static void main(String[] args) {
    int[][] arr = {
      {23, 4, 1},
      {18, 12, 3, 9},
      {78, 99, 34, 56},
      {18, 12}
    };

    
    System.out.println("Minimum value: " + min(arr)); // Find min value
  }

  static int min(int[][] arr) {
    int min = Integer.MAX_VALUE;
    for (int[] row : arr) {
      for (int val : row) {
        if (val < min) {
          min = val;
        }
      }
    }
    return min;
  }

  static int[] search(int[][] arr, int target) {
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col] == target) {
          return new int[]{row, col};
        }
      }
    }
    return new int[]{-1, -1}; // Target not found
  }
}
