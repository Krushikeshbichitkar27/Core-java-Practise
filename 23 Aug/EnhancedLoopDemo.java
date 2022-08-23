/*
Program :  Find colour with using enhance loop
code by : Krushikesh
Date :23/08/22
*/

//declaring the class 
class EnhancedLoopDemo
{    
//print name of the colours
static void printNames()
 {
  //String colourNames[]={"Red","Yellow","Green","Blue","Orange"};
  for(String i:colourNames)
  
  System.out.println(i);  //drawback : we cant reversw the loop
  }
   
   //calling main method
   public static void main(String args[])
   {
   printNames(new String[]{"Red","Yellow","Green","Blue","Orange"}); //Anonymous array: array without name
   }
  
}