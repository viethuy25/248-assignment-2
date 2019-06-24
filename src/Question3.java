//-----------------------------------------------
//Assignment 2
//Written by Huy Nguyen, student ID: 40023289
//For COMP 248 Section W - Winter 2017
//-----------------------------------------------
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int time=0,item=0;
		double spending=0.0,asset=100.0;
		System.out.print("Enter the initial amount : ");
		int amount1=input.nextInt();
		System.out.print("\n");	
		input.nextLine();
		asset=amount1;
		if (amount1 <=100)
		{
				System.out.println("Please save money and come back later !! \n\n");
				System.out.println("------------------------------------------");
				System.out.println("Here is a summary of Mr. Toto's purchases.");
				System.out.println("------------------------------------------");
				String s1="Number of items  ";
				String s2="  Asset";
				String s3="    Spending";
				String s4= s1.concat(s2).concat(s3);
				System.out.println(s4);
				System.out.println("     "+ item+"\t\t   "+ asset +"\t    "+ spending);
		}
		else 
			{
				System.out.print("Do you want to make purchases (Y/N) ? ");
				String buy = input.nextLine();
				if (buy.equals("y"))
				{
					while (time!=1)
					{
						if (item<10)
						{
							System.out.print("\n"+"Please enter the price of the item = ");
							int price= input.nextInt();
							input.nextLine();
							if (((asset-price)>10)&&((asset-price)<amount1))
							{
								asset= asset-price;
								spending = spending+price;
								System.out.println("A purchase is accpected \n");
								item=item+1;
								if (item<=10)
								{
									System.out.print("Do you want to continue (Y/N) ? ");
									String cont= input.nextLine();
									if (cont.equalsIgnoreCase("y"))
									{
										if (item>=10)
										{
											System.out.print("Maximal number of purchases is reached !!\n\n");
											System.out.println("------------------------------------------");
											System.out.println("Here is a summary of Mr. Toto's purchases.");
											System.out.println("------------------------------------------");
											String s1="Number of items  ";
											String s2="  Asset";
											String s3="    Spending";
											String s4= s1.concat(s2).concat(s3);
											System.out.println(s4);
											System.out.println("     "+ item+"\t\t   "+ asset +"\t    "+ spending);
											time=1;
										}
									}
									if (cont.equalsIgnoreCase("n"))
									{
										time=1;
										System.out.println("\n"+"Lack of desire of Mr. ToTo. !!\n\n");
										System.out.println("------------------------------------------");
										System.out.println("Here is a summary of Mr. Toto's purchases.");
										System.out.println("------------------------------------------");
										String s1="Number of items  ";
										String s2="  Asset";
										String s3="    Spending";
										String s4= s1.concat(s2).concat(s3);
										System.out.println(s4);
										System.out.println("     "+ item+"\t\t   "+ asset +"\t    "+ spending);
									}
								}
							}
							else
							{
								System.out.println("Insufficient assets !! \n");
								System.out.print("Do you want to continue (Y/N) ? ");
								String cont= input.nextLine();
								if (cont.equals("y"))
									time=0;
								if (cont.equals("n"))
								{
									time=1;
									System.out.println("\n"+"Lack of desire of Mr. ToTo. !!\n\n");
									System.out.println("------------------------------------------");
									System.out.println("Here is a summary of Mr. Toto's purchases.");
									System.out.println("------------------------------------------");
									String s1="Number of items  ";
									String s2="  Asset";
									String s3="    Spending";
									String s4= s1.concat(s2).concat(s3);
									System.out.println(s4);
									System.out.println("     "+ item+"\t\t   "+ asset +"\t    "+ spending);
								}
							}
						}
						else
						{
							System.out.print("Do you want to continue (Y/N) ? ");
							String cont= input.nextLine();
							if (cont.equalsIgnoreCase("y"))
							{
								System.out.println("Maximal number of purchases is reached !!\n\n");
								System.out.println("------------------------------------------");
								System.out.println("Here is a summary of Mr. Toto's purchases.");
								System.out.println("------------------------------------------");
								String s1="Number of items  ";
								String s2="  Asset";
								String s3="    Spending";
								String s4= s1.concat(s2).concat(s3);
								System.out.println(s4);
								System.out.println("     "+ item+"\t\t   "+ asset +"\t    "+ spending);
								time=1;
							}
							if (cont.equalsIgnoreCase("n"))
							{
								System.out.println("\n"+"Lack of desire of Mr. ToTo. !!\n\n");
								System.out.println("------------------------------------------");
								System.out.println("Here is a summary of Mr. Toto's purchases.");
								System.out.println("------------------------------------------");
								String s1="Number of items  ";
								String s2="  Asset";
								String s3="    Spending";
								String s4= s1.concat(s2).concat(s3);
								System.out.println(s4);
								System.out.println("     "+ item+"\t\t   "+ asset +"\t    "+ spending);
							}
						}
					}
				}
				if (buy.equals("n"))
					{
						System.out.println("Lack of desire of Mr. ToTo. !! \n\n");
						System.out.println("------------------------------------------");
						System.out.println("Here is a summary of Mr. Toto's purchases.");
						System.out.println("------------------------------------------");
						String s1="Number of items  ";
						String s2="  Asset";
						String s3="    Spending";
						String s4= s1.concat(s2).concat(s3);
						System.out.println(s4);
						System.out.println("     "+ item+"\t\t   "+ asset +"\t    "+ spending);
					}
			}
		System.out.println("\nThank you for your vist and goodbye !!");
		input.close();
	}
}
