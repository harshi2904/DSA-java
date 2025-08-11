import java.util.Scanner;

class Palindrome1 {

    static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    static boolean isPalindromeNumber(int num) {
        return num == reverseNumber(num);
    }

    static int findPalindrome(int num) {
        int steps = 0;
        while (true) {
            int rev = reverseNumber(num);
            int sum = num + rev;
            steps++;
            System.out.println("Step " + steps + ": " + num + " + " + rev + " = " + sum);
            if (isPalindromeNumber(sum)) {
                return sum;
            }
            num = sum; // Update number for next iteration
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Negative numbers are not supported.");
        } else {
            int result = findPalindrome(num);
            System.out.println("Palindrome found: " + result);
        }
    }
}

