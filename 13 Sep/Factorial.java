/*
@ Program: find factorial 5!=5*4*3*2*1
code by : Krushikesh
Date : 13 September 2022
*/

//creating class AsciiValue1
class Factorial
{

	//creating method printNumbers
 static void checkFactorial(int num) //methodto print number
 {
  long result=1L;
  for(int i=num;i>=1;i--)
  {
   result*=i;
  }
 System.out.println("The factorialof the number "+ num + "is :");
 }

 //calling main method
 public static void main(String...args)
{
  int number=Integer.parseInt(args[0]);
 // evenOdd(number);
  trenaryEvenOdd(number);
  }
  }