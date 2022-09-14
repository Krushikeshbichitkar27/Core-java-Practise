/*
@ Program: Nested for loop printing pattern

code by : Krushikesh
Date : 14 September 2022
*/

//creating class PatternDemo1
class PatternDemo1
{

	//creating method first pattern
/* static void firstPattern(int num) 
 {

  for(int i=num;i<=num;i++) //condition for 1st printing
  {
 
    System.out.print("*");
  }
 
 }*/
 //creating method of second pattern
 static void secondPattern(int numOfRow) 
 {

  for(int i=1;i<=numOfRow;i++) //condition for 2nd printing  
  {
 
    System.out.println();
	for(int j=1;j<=i;j++)
	{
	System.out.print("*");
	}
  }
 /*
 //creating method of second pattern
 static void thirdPattern(int numOfRows) 
 {

  for(int i=1;i<=numOfRows;i++) //condition for  printing  pattern
  {
 
    System.out.println();
	for(int j=numOfRows;j>=i;j--)
	{
	System.out.print("* ");
	}
  }
 
  //creating method of second pattern
 static void fourthPattern(int numOfRows) 
 {

  for(int i=1;i<=numOfRows1;i++) //condition for  printing  pattern
  {
 
    System.out.println();
	for(int j=numOfRows;j>=i;j--)
	{
	System.out.print("* ");
	}
	for(int i=2;i<=numOfRows;i++) //condition for printing pattern reverse 
   {
 
    System.out.println();
	for(int j=numOfRows;j>=i;j--)
	{
	System.out.print("* ");
	}
  }
 }
*/
 //calling main method
public static void main(String...args)
{
  int number=Integer.parseInt(args[0]);

 // firstPattern(number); //for first Pattern
  secondPattern(number); // for second Pattern
   //thirdPattern(number); // for thirdPattern
    //fourthPattern(number); // for fourthPattern
  
  }
  }