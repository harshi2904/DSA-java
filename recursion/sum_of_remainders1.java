import java.util.Scanner;
class sum_of_remainders1 {
  static int sumofremainders(int n,int r){
    if (n == 0){ 
      return 0;//base case
    }else{
      return(n%r)+sumofremainders(n - 1, r); 
    }
  }
  // Print all remainders from 1 to n when divided by r
  static void printRemainders(int n, int r) {
    for (int i = 1; i <= n; i++) {
      System.out.print((i % r) + " ");
    }
    System.out.println(); // for newline after printing
  }
  static int sumremainders ( int n,int r )
  {
        // arm length
    if ( n == 0)
    {
      return 0;
      }
    if ( n < 1 ){
      return -1;
    }
        
        // environment
        
  return sumofremainders (n,r); 

  }

  public static void main(String[] args) {
    Scanner kbd = new Scanner (System.in);
    int n = kbd .nextInt();
    int r = kbd .nextInt();
    System.out.println(sumremainders(n,r));
    printRemainders(n,r);
  
}}
