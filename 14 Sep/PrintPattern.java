/*
@ Program:  printing left side pattern


code by : Krushikesh
Date : 14 September 2022
*/

//creating class AsciiValue1
class PrintPattern
{

	//creating method first pattern
 static void firstPattern(int num) 
 {
	 for(int i=1;i<=num;i++)  //outer loop 
	 {
		 System.out.println();
		 for(int spaces=num-i;spaces>0;spaces--)  //inner loop
		 {
			 System.out.print("");
		 }
		 for(int j=1;j<=i;j++)   //j=1 1<=2
		 {
			 System.out.print("*");
		 }
	 }
	 for(int i=1;i<=num;i++)  //outer loop 
	 {
		 System.out.println();
		 for(int spaces=num-i;spaces>0;spaces--)  //inner loop
		 {
			 System.out.print("");
		 }
		 for(int j=1;j<=i;j++)   //j=1 1<=2
		 {
			 System.out.print("*");
		 }
	 }
 
 }
 
 //calling main method
 public static void main(String...args)
 {
  int number=Integer.parseInt(args[0]);

     firstPattern(number); //for first Pattern
	 
 }
}