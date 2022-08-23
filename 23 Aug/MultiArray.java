/*
Program :  Print Multi dimentional array with using enhance loop
code by : Krushikesh
Date :23/08/22
*/

//declaring the class 
class MultiArray
{    
// method to print the value
static void printValue()
 {
 int myArray [][] ={{1,0,0},{0,1,0},{0,0,1}};
 /*for(int i=0;i<3;i++)
 {
	  for(int i=0;i<3;j++)
	  {
		  System.out.print(myArray[i][j]+ " ");
	  }
	  System.out.println();
 }*/
 for(int[] arrayRow:myarray)
 {
	 for(int j:arrayRow)
	 {
		System.out.print(j+ " "); 
	 }
 //calling main method
	public static void main(String args[])
	{
	 printValue();
	}
 }