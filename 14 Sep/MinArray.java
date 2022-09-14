/*
Program :  Find minimum number from the list of the number
code by : Krushikesh
Date :14 September 2022
*/

//declaring the class 
class MinArray
{
	//method to calculate min number from array
 static void minNumber()
 {
	 int []arr={12,23,45,8,55,89};
	 int num=23;
	 //traversing the array
	 for(int i=0;i<arr.length;i++)
	 {
		 if(num>arr[i]) //checking whether the number i greater than number in arr
            num=arr[i]; //assigning lesser value
		
	 }		 
	 System.out.println("The minimum number is"+num);
 }
 
 
 //calling main method
 public static void main(String args[])
 {
	 //calling minNumbermethod
	 minNumber();
 }
}