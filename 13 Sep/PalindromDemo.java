/*
@ Program: Print the number is palindrome or not
3456 : no palindrome
3443 : palindrome

code by : Krushikesh
Date : 13 September 2022
*/

//creating class PalindromeDemo
class PalindromeDemo
{
	//creating method checkPalindrome
static void checkPalindrome(int num1)
{
int remainder=0;
int reverseNumber=0; // the number used to store the reverse number
int temp =number;    // original number is stored in temp
while(number>0)
  {
   remainder=number%10;  //getting reminder
   reverseNumber=(reverseNumber*10)+remainder;
  }
	if(temp==reverseNumber)
	{
	System.out.println("----The number "+ temp +" is palindrome"); //print output if number is palindrome
	}
	else
	System.out.println("----The number "+ temp +" is not palindrome"); //print output if number is not palindrome
  }
}
//calling main method
public static void main(String...args)
{
	int num1=Integer.parseInt(args[0]);
	checkPalindrome(num1); //printing method checkPalindrome
}
}