// // print 1 to 'n'
import java.util.Scanner;
class print_1_to_n
{
     private static void print_1_to_n_helper ( int whatto, int stopAt)
	 {
	     // base case
		 if ( whatto > stopAt )
		    return;
			System.out.printf("%d " ,whatto);
	     print_1_to_n_helper ( whatto + 1, stopAt );
	 }
     public static void print_1_to_n ( int n )
	 {
	     // arm length
		 if ( n == 1)
		 {
		    System.out.print("1");
			return;
		 }
		 if ( n < 1 )
		     return;
			 
			 // environment
			 
		print_1_to_n_helper ( 1, n);
		
			 
			 
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
    int num;
		num  = kbd.nextInt();
		print_1_to_n(num);
	 }
}