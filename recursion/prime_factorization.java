import java.util.Scanner;
class prime_factorization
{
	//9007199254740991
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
        long num;
		 num = kbd.nextLong();
		 int cf;
		 cf = 2;
		 while  ( num % 2 == 0)
			 {
			    System.out.printf("%d ", cf );
				num /= cf;
			 }
		 for( cf = 3; cf * cf <= num ; cf+=2)
		 {
		      while  ( num % cf == 0)
			 {
			    System.out.printf("%d ", cf );
				num /= cf;
			 }
		 }
		 if ( num != 1)
			 System.out.printf("%d ", num);
			 
	 }

}
