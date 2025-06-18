import java.util.Scanner;
class fibo
{

     private static int fibo_helper ( int term )
	 {
	   // base case(s)
		  if ( term <= 1 )
		     return term;
			 
			 return fibo_helper( term- 1) + fibo_helper ( term - 2);
	 }
     public static int fibo ( int term )
	 {
	      // arm length
		  if ( term <= 1 )
		     return term;
	    if ( term == 2)
          return 1;
          // env

          // call helper
          return fibo_helper ( term );		  
			 
	 }
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        int term;
		
		term = kbd.nextInt();
		int fibo_term = fibo ( term );
		System.out.printf("%dth of FIBO = %d\n", term, fibo_term);
	 }
}