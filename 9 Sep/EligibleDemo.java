/*
@ Program : Java program of if else conditional statement eligible demo using nested if 
code by : Krushikesh
Date 09 September 2022
*/

//declaring class
class EligibleDemo 
{
 // Calling main method
    public static void main(String[] args) 
	{
	//taking input of marks
	float totalMarks=Float.parseFloat(args[0]);
	float pcmMarks=Float.parseFloat(args[1]);
	//nested if
	if(totalMarks>60)
		{
		 if((totalMarks>=80)||(pcmMarks>=85))
			{
				System.out.println("You are eligible for taking addmission in B.Tech"); //print if eligible
			}// enf of inner if
			else //dangling else
			{
				System.out.println("You are eligible for addmission(Except B.Tech)");;//print if not eligible
			}//end of inner else
		}
	// end of outer if
		else
		{
			System.out.println("You are not eligible for taking addmission in B.Tech"); //print if not eligible
		}
	
	} //end main method
}//end class