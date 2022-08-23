/*
Program :  Find minimum number from the list of the number
code by : Krushikesh
Date :23/08/22
*/

//declaring the class 
class MinArray
{
	//method to calculate min number from array
 static void minNumber()
 {
	 int []arr={12,23,45,8,55,89};
	 int mNum;
	 //traversing the array
	 for(int i=0;i<arr.length;i++)
	 {
		 if(mNum>arr[i]) //checking whether the number i greater than number in arr
            mNum=arr[i]; //assigning lesser value
		
	 }		 
	 System.out.println("The minimum number is"+mNum);
 }
 
 
 //calling main method
 public static void main(String args[])
 {
	 //calling minNumbermethod
	 minNumber();
 }
}