/*
@ Program : Java program of if else conditional statement compairing numbers which is gratest amoung 3 numbers
code by : Krushikesh
Date 09 September 2022
*/

//declaring class
class IfElseDemo 
{
    // Calling main method
    public static void main(String[] args) 
	{
	//taking 3 input and parsing
	int num1=Integer.parseInt(args[0]);
	int num2=Integer.parseInt(args[1]); 
	int num3=Integer.parseInt(args[2]);
	// compairing 3 numbers are equals
	if((num1==num2)&&(num2==num3))
	{
		System.out.println("All numbers are equals");
	}
	//compairing 3 numbers are gratest
	else if((num1>num2) && (num1>num3))
		{
			System.out.println("Number"+ num1+ "is gratest"); //print if num1 is gratest
		}
		else if((num2>=num3))
			{
				System.out.println("Number"+ num2+ " is gratest" ); //print if num2 is gratest
			}
			else //dangling else
			{
				System.out.println("Number"+ num3+ " is gratest " );//print if num3 is gratest
			}
		
	}
//end of main method

}// end code of class