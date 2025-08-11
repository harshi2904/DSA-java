import java.util.Scanner;
class no_of_digits{
  public static int num_of_digits_helper(int n){
    //base class
    if (n ==0)
        return 0;
    int temp_res;
    temp_res = num_of_digits_helper(n/10);
    temp_res++;
    return temp_res;

    
  }
  public static int num_of_digits(int n){
    //arms length
    if (n == 0)
       return 1;
    if(n<0) n = -n;
  return num_of_digits_helper(n);

    }
    
    
  

  
  public static void main(String[] args) {
    Scanner kbd = new Scanner (System.in);
    int num = kbd.nextInt();
    int number_of_digits = num_of_digits(num);
    System.out.printf("Number of digits in %d is %d\n", num, number_of_digits);

  }
}



