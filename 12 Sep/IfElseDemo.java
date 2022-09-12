/*
@ Program : Java program A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
code by : Krushikesh
Date 12 September 2022
*/

//declaring class
class IfElseDemo 
{
    // Calling main method
    public static void main(String[] args) 
	{
		int marks=Integer.parseInt(args[0]);
		
		if(marks>80)
		{
			System.out.println("You have passed with grade A" );
		}
		
		  else if((marks>60)&&(marks<80))
		  {
			  System.out.println("You have passed with grade B" );
		  }
		        
		         else if((marks>50)&&(marks<60))
				 {
					  System.out.println("You have passed with grade C" );
				 }
			          
		             else if((marks>45)&&(marks<50))
					 {
						 System.out.println("You have passed with grade D" );
					 }
			                 
		               else if((marks>25)&&(marks<45))
					   {
						  System.out.println("You have passed with grade E" );  
					   }
			                 
		  else if(marks<25)
		  {
		    System.out.println("You have failed");
		  }
			                    
	}
}

		
		