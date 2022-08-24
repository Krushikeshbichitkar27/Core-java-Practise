/*
Program : programing varargs
code : Krushikesh
Date : 24 Augest 2022
*/
// declaring the class
class Varargs
{
	//method to print array
	static void betterPrint(int ... x) //ellipse operator
	{
		System.out.println();
		System.out.println("in int");
		System.out.println("Printing array elements :");
		for(int i:x)
		{
			System.out.println(i+" ");
		}
	}
	//calling main method
 public static void main(String args[])
 {
	 betterPrint(4,5);
	 betterPrint(45,34,90,27);
	 betterPrint();

 }
 
}