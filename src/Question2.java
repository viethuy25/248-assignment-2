//-----------------------------------------------
//Assignment 2
//Written by Huy Nguyen, student ID: 40023289
//For COMP 248 Section W - Winter 2017
//-----------------------------------------------
public class Question2 {

	public static void main(String[] args) 
	{
		int col=1,row=1,mult;
		final int I_MAX=15,J_MAX=10;
		System.out.println("   |1       2      3      4      5      6      7      8      9      10");
		System.out.println("______________________________________________________________________");
		for (row=1;row<=I_MAX;row++)
		{		
			
			if (row<10)
				System.out.print(row+ "  |");
			else
				System.out.print(row+ " |");
			for (col=1;col<=J_MAX;col++)
			{
				mult=row * col;
				if (col<=row)
					System.out.print(mult+ "    ");
				if (mult < 10)
					System.out.print("  ");
	            else if (mult < 100)
	            	System.out.print(" ");
			}
			if ((col<=row)||(col>row))
				System.out.println();
		}
	}

}
