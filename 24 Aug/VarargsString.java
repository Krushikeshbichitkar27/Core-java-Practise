/*
Program : programing varargs to print string
code : Krushikesh
Date : 24 Augest 2022
*/
// declaring the class
class VarargsString
{
	//method to print array
	static void betterPrint(String ... x) //ellipse operator
	{
		System.out.println();
		System.out.println("in String");
		System.out.println("Printing array elements :");
		for(String i:x)
		{
			System.out.println(i+" ");
		}
	}
	//calling main method
 public static void main(String args[])
 {
	 betterPrint("Krushikesh","Bichitkar");
	 betterPrint();
 }
}