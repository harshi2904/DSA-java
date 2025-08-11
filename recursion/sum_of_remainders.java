import java.util.Scanner;
class sum_of_remainders{
  public static  int sum_of_remainder_helper(int n,int r){
    //base case
    if (n==0) return -1;
  else{
    for (int i = 1;i<n;i++){
      sum_of_remainder_helper(i%n);
    }
  }

  }
  public static void  int summ_of_remainders(int n,int r){
    //arms length
    if (n == 0) return -1 ;
    sum_of_remainder_helper(1,n);

  }
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int n = kbd.nextInt();
    int r = kbd.nextInt();

    

    }

  }

