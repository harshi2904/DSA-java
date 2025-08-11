import java.util.Scanner;
class factorial1{
  public static long factorial_helper(int n){
    //base class
    if (n==0)
        return 1L;
    return n * factorial_helper(n-1);

  }
  public static long factorial(int n){
    //arms length
    if (n<0)
        return -1L;
    if (n == 0)
        return 1L;
    if (n == 1)
        return 1L;
    if (n == 2)
        return 2L;
    return factorial_helper(n);
  }
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int num = kbd.nextInt();
    long factorial_of_num = factorial(num);
    System.out.printf("%d! = %d\n",num,factorial_of_num);
  }
}