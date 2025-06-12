public class evendigits {
  public static void main(String[] args) {
    int[] nums = {12, 345, 2, 6, 7896}; // Sample input
    System.out.println("Count of numbers with even digits: " + findNumbers(nums));
  }

  static int findNumbers(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if (even(num)) {
        count++;
      }
    }
    return count;
  }

  // Function to check if number has even number of digits
  static boolean even(int num) {
    int numberOfDigits = digits(num);
    return numberOfDigits % 2 == 0;
  }

  // Function to count the number of digits in a number
  static int digits(int num) {
    if (num == 0) return 1;
    if (num < 0) num = num * -1; // Handle negative numbers

    int count = 0;
    while (num > 0) {
      count++;
      num /= 10;
    }
    return count;
  }
}
