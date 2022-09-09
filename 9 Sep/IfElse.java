/*
@ Program : Java program of if else conditional statement
code by : Krushikesh
Date 09 September 2022
*/

//declaring class
class IfElse 
{
    // Calling main method
    public static void main(String[] args) 
	{
	int age=Integer.parseInt(args[0]); //taking input and parsing
	if(age>=18) //checking age
	{
	System.out.println("You can Vote"); //print if age is grater than 18
	}
	else
	{
	System.out.println("Too Young"); //print age is less than 18
	}
}
//end of main method

}