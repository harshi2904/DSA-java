import java.util.Scanner;

class palindrome{

    static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    static boolean isPalindromeNumber(int num) {
        int original = num;
        int reversed = reverseNumber(num);
        return original == reversed;
    }

    static int findPalindrome(int num) {
        int rev = reverseNumber(num);
        int sum = num + rev;
        if (isPalindromeNumber(sum)) {
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

