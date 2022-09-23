/*
Program : programing varargs
code : Krushikesh
Date : 23 September 2022
*/
// declaring the class
class VarargsDemo
{
	//method to print array
	static void printArray(int []arr)
	{
		System.out.println();
		System.out.println("-------------------");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
	}
	static void betterPrint(int ... x) //ellipse operator
	{
		System.out.println();
		System.out.println("---------in Integer---------");
		for(int i:x)
		{
			System.out.println(i+" ");
		}
	}
	
	static void betterPrint(float ... x) //ellipse operator
	{
		System.out.println();
		System.out.println("--------in Float----------");
		for(float i:x)
		{
			System.out.println(i+" ");
		}
	}
	//calling main method
 public static void main(String...args)
 {
	  //int a1[]={};
	 //int a2[]={7,8,6};
	 //int a3[]={45,39,12,90,27}; 
	 
	 betterPrint(7,8,6);
	 betterPrint(15,64,90,10,127);
	 betterPrint(15.2f,64.5f,90.7f,10.00f,1.08f);
	 
	 
	betterPrint();
	 //printArray(a1);
	 //printArray(a2);
	 //printArray(a3);

//betterPrint(): ambiguity overloading varargs (Its confuse to which method will select)

 }// end of main method
 
}//end of class