/*
@ Program: Print trenary operator
code by : Krushikesh
Date : 13 September 2022
*/

//creating class AsciiValue1
class TrenaryDemo
{

	//creating method printNumbers
 static void evenOdd(int num) //methodto print number
 {
  if(num%2==0)
	  System.out.println("Even number");
  else
	  System.out.println("Odd number");
 
 }
 static void trenaryEvenOdd(int num) //methodto print number
 {
  
	String result=(num%2==0)?  "Odd number":"Even number";
 System.out.println(result);
 }
 //calling main method
 public static void main(String...args)
{
  int number=Integer.parseInt(args[0]);
 // evenOdd(number);
  trenaryEvenOdd(number);
  }
  }