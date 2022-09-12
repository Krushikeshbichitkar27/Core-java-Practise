/*
@ Program: Print number using for loop
code by : Krushikesh
Date : 12 September 2022
*/

//creating class AsciiValue1
class ForLoop
{

	//creating method printNumbers
 static void printNumbers(int t) //methodto print number
 {
	 int i;
  for(int i=0;i<=t; i++) //giving condition
  {
	  System.out.println(i);
  }
 }
 //creating method printTable
 static void printTable(int num) //method to print table
 {
 System.out.println("Printing the table of: "+num);
 for(int i=1;i<=10;i++) //giving condition
 {
	  System.out.println(num+"X"+i+"="+(num*i));
 }
 }
 //creating method infinitLoop
 static void infinitLoop(int num) //method to print infinit Loop
 {
 for(int i=1;i<10;i--)  //giving condition
 {
	  System.out.println(i);
 }
 // to come out of this loop 
 }
 //calling main method
 public static void main(String args[])
{
    // int total=Integer.parseInt(args[0]);	// taking a character input
      //calling method printNumbers  //passing value as a parameter
	// printNumbers(total);
	 int number=Integer.parseInt(args[0]);
	 printTable(number);//calling method printTable 
	//infinitLoop():
}
}
