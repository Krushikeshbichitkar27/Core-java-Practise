/*
Program :  Find number is present in array
code by : Krushikesh
Date :14 September 2022
*/

//declaring the class 
class ArraySearch
{    
static void findNumber(int searchNum)
 {
  int[] arr= {12, 32, -3, 74, 55, 82};
    
    boolean flag = false;
	//traversing the array

    for (int i:arr)
		{
      if (searchNum ==i)
		  {
        flag = true;
        break;
      }
    }
    
    if(flag) // flag==true
      System.out.println("The number" + searchNum + " is found."); //print if the value found
    else
      System.out.println("The number" + searchNum + " is not found."); //print if the value not found
  }
  //calling main method
  public static void main(String args[])
  {
	  //calling checkArray method
	  boolean result;
	  findNumber(Integer.parseInt(args[0]));
  }
}