public class OrderAgnosticBinarySearch {
  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 9, 11, 15}; // Example sorted array
    int target = 7;
    int result = orderAgbs(arr, target);
    System.out.println("Target found at index: " + result);
}

static int orderAgbs(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    // Determine if the array is sorted in ascending or descending order
    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
        int mid = start + (end - start) / 2;  // Mid should be inside the loop

        if (arr[mid] == target) {
            return mid;
        }
        if (isAsc) {  // Ascending order case
          if (target < arr[mid]) {
              end = mid - 1;
          } else {
              start = mid + 1;
          }
      } else {  // Descending order case
          if (target > arr[mid]) {
              end = mid - 1;
          } else {
              start = mid + 1;
          }
      }
  }
  return -1;// Target not found
}


  
}
