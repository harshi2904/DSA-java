import java.util.Scanner;
class n_t_1 {
  public static void print_n_to_1_helper(int n){
    //base class
    if (n==0){
      return;
    
    

    }
    System.out.printf("%d ",n);
    print_n_to_1_helper(n-1);

  }
  public static void print_1_to_n(int n){
    //arms length
    if (n<1){
      return ;
    
    }
    print_n_to_1_helper(n);
    

  }
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int num = kbd.nextInt();
    print_1_to_n(num);
  }
  
}
