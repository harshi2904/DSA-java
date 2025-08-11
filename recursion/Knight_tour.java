import java.util.Scanner;

class knight_tour
{
     private static void kt_helper ( int dim, int [][] cb, int row, int col, int moveNumber)
	 {
	 
	    if ( dim * dim == moveNumber )
		{
		   cb [ row ] [ col ] = moveNumber;
		   print(cb);
		   return;
		}
	    // enumerate all the choices m1,m2,m3,m4,m5,m6,m7,m8
		// loop 1 by 1
		// check safety
		//    change the status
		//    solve further
		//    reinstate
		
		int mr;
		int mc;
		// m1 
		mr = row - 1;
		mc = col - 2;
		if ( mr>=0 && mc >= 0 && cb [ mr ] [mc] == 0)
		{
		   cb [ row ] [ col ] = moveNumber;
		   kt_helper ( dim, cb, mr, mc , moveNumber+1);
		   cb [ row ] [ col ] = 0;
		   
		}
    //m2
    mr = row -2;
    mc = col -1;
    if (mr>=0 && mc <dim && cb [mr] [mc] == 0)
    {
      cb [ row ] [ col ] = moveNumber;
		   kt_helper ( dim, cb, mr, mc , moveNumber+1);
		   cb [ row ] [ col ] = 0;

    }
		//m3
    mr = row -2;
    mc = col +1;
    if (mr>=0 && mc <dim && cb [mr] [mc] == 0)
    {
      cb [ row ] [ col ] = moveNumber;
		   kt_helper ( dim, cb, mr, mc , moveNumber+1);
		   cb [ row ] [ col ] = 0;

    }
    //m4
    mr = row -1;
    mc = col +2;
    if (mr<dim&& mc < dim && cb [mr] [mc] == 0)
    {
      cb [ row ] [ col ] = moveNumber;
		   kt_helper ( dim, cb, mr, mc , moveNumber+1);
		   cb [ row ] [ col ] = 0;

    }
		//m5
    mr = row +1;
    mc = col +2;
    if (mr<dim && mc >= 0 && cb [mr] [mc] == 0)
    {
      cb [ row ] [ col ] = moveNumber;
		   kt_helper ( dim, cb, mr, mc , moveNumber+1);
		   cb [ row ] [ col ] = 0;

    }
    //m6
    
    mr = row +2;
    mc = col +1;
    if (mr>=0 && mc >= 0 && cb [mr] [mc] == 0)
    {
      cb [ row ] [ col ] = moveNumber;
		   kt_helper ( dim, cb, mr, mc , moveNumber+1);
		   cb [ row ] [ col ] = 0;

    }
    //m7
    mr = row +2;
    mc = col -1;
    if (mr>=0 && mc >= 0 && cb [mr] [mc] == 0)
    {
      cb [ row ] [ col ] = moveNumber;
		   kt_helper ( dim, cb, mr, mc , moveNumber+1);
		   cb [ row ] [ col ] = 0;

    }
    //m8

    mr = row +1;
    mc = col -2;
    if (mr>=0 && mc >= 0 && cb [mr] [mc] == 0)
    {
      cb [ row ] [ col ] = moveNumber;
		   kt_helper ( dim, cb, mr, mc , moveNumber+1);
		   cb [ row ] [ col ] = 0;

    }


    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 }
     public static void knight_tour ( int dim)
	 {
	    // arm length
		if ( dim < 5 ) return;
		// set the environment
		int [][] board = new int [dim][dim];
		// call helper - recursive, pass , initiate
		kt_helper ( dim, board, 0,0,1);
		
	 }
     public static void main(String [] args)
	 {
		int dim;
		Scanner kbd = new Scanner ( System.in );
		dim = kbd.nextInt();
		knight_tour ( dim );
	 }
  }