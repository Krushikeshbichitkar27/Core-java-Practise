/*
Program :  Print Pattern 
code by : Krushikesh
Date :23/08/22
*/

//declaring the class 
class MultiDimPattern
{    
// method to print the Pattern
static void printValue()
 {
 for(int i=1;i<=5;i++)
 {
	 for(int j=1;j<=i;j++)
	 {
		 System.out.println("*"+ "  ");
	 }
	 System.out.println();
 }
 }
 //calling main method
 public static void main(String args[])
 {
	 printValue();
	 
 }
}