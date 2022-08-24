/*
Program : print values of 2D array 
code : Krushikesh
Date : 24 Augest 2022
*/
// declaring the class

import java.util.Scanner;
class InputDemo
{
	//calling main method
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your name:");
		String name =sc.nextLine();
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Enter your marks:");
		float marks=sc.nextFloat();
		System.out.println("Enter the genderm for male and f for female:");
		char gender=sc.next().charAt(0);
		
		System.out.println("Enter any 10 number:");
		int []arr= new int[10];
		for(int i:arr)
		{
			i= sc.nextInt();
		}
	}
}
