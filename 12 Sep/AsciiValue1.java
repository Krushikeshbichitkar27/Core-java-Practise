/*
@ Program: Print Ascii Value of character 
code by : Krushikesh
Date : 12 September 2022
*/

//creating class AsciiValue1
class AsciiValue1
{
	//creating method printAsciiValue
 static void printAsciiValue()
 {
	
	 int asciiVal=cValue;  //computing Ascii value
	 System.out.println("The ASCII value of"+cValue+"is :"+asciiVal);  //print output ascci value
 }// end of method
//calling main method
public static void main(String args[])
{
	 char value=args[0].charAt(0);  // taking a character input
	 
     //calling method printAsciiValue  //passing value as a parameter
	 printAsciiValue(value);
}
//end of main
}
//end of class
