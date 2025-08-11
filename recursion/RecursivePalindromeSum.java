import java.util.Scanner;

public class RecursivePalindromeSum {

    static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    static int findPalindrome(int num) {
        int rev = reverseNumber(num);
        int sum = num + rev;
        if (isPalindrome(sum)) {
            return sum;
        } else {
            return findPalindrome(sum);  // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findPalindrome(num));
    }
}