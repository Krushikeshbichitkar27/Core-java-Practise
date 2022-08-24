/*
Program : programing varargs
code : Krushikesh
Date : 24 Augest 2022
*/
// declaring the class
class VarargsDemo
{
	//method to print array
	static void printArray(int []arr)
	{
		System.out.println();
		System.out.println("Printing array elements :");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
	}
	static void betterPrint(int ... x) //ellipse operator
	{
		System.out.println();
		System.out.println("Printing array elements :");
		for(int i:x)
		{
			System.out.println(i+" ");
		}
	}
	//calling main method
 public static void main(String args[])
 {
	/*  int r1[]={};
	 int r2[]={4,5};
	 int r3[]={45,34,90,27}; */
	 
	 betterPrint(4,5);
	 betterPrint(45,34,90,27);
	 
	 betterPrint();
	 //printArray(r1);
	 //printArray(r2);
	 //printArray(r3);
 }
 
}