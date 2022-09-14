/*
Program :  Find number is present in array

code by : Krushikesh
Date :14 September 2022
*/

//declaring the class 
class CheckArrayDemo
{
	//method to check number in array
 static void checkArray()
 {
  int[] num = {12, 32, 63, 74, 55};
    int toFind = 32;
    boolean found = false;

    for (int n : num)
		{
      if (n == toFind)
		  {
        found = true;
        break;
      }
    }
    
    if(found)
      System.out.println(toFind + " is found."); //print if the value found
    else
      System.out.println(toFind + " is not found."); //print if the value not found
  }
  //calling main method
  public static void main(String args[])
  {
	  //calling checkArray method
	  checkArray();
  }
}