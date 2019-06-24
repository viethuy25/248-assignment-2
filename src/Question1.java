//-----------------------------------------------
//Assignment 2
//Written by Huy Nguyen, student ID: 40023289
//For COMP 248 Section W - Winter 2017
//-----------------------------------------------
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		Scanner keyIn= new Scanner (System.in);
		int y;
		System.out.print("Enter a positive number of days n : ");
		int n= keyIn.nextInt();
		y=n/365;
		while (n>=0)
		{
			n=-1;
			if (y==0)
				System.out.print("Number of years : "+ 1);
			else
				System.out.print("Number of years : " + y);
		}
		keyIn.close();

	}

}
