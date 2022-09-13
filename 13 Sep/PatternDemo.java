/*
@ Program: Nested for loop printing pattern
*
*
*
*
2nd pattern
*
**
***
****
*****
code by : Krushikesh
Date : 13 September 2022
*/

//creating class AsciiValue1
class PatternDemo
{

	//creating method first pattern
 static void firstPattern(int num) 
 {

  for(int i=num;i<=num;i++) //condition for 1st printing
  {
 
    System.out.println("*");
  }
 
 }
 //creating method of second pattern
 static void secondPattern(int numOfRow) 
 {

  for(int i=1;i<=numOfRow;i++) //condition for 2nd printing  
  {
 
    System.out.println();
	for(int j=1;j<=i;j++)
	{
	System.out.println("*");
	}
  }
 
 }

 //calling main method
 public static void main(String...args)
{
  int number=Integer.parseInt(args[0]);

 // firstPattern(number); //for first Pattern
  secondPattern(number); // for second Pattern
  }
  }