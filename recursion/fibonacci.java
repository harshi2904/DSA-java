import java.util.Scanner;
class fibonacci{
  public static int fibo_helper(int n){
    //base class
    if (n<=1)
        return n;
    return fibo_helper(n-1) + fibo_helper (n-2);
  }
  public static int fibonacci1(int n){
    //arms length
    if (n == 0)
        return -1;
    if (n == 1)
      return 1;
    if (n == 2)
      return 1;
    return fibo_helper(n);
    

  }
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int term = kbd.nextInt();
    int fibo_val_of_term = fibonacci1(term);
    System.out.printf("%d " ,fibo_val_of_term);


}

}

