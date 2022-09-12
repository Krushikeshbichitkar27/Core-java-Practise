/*
@ Program : Java program to print number of days according to month
code by : Krushikesh
Date 12 September 2022
*/

//declaring class
class SwitchMonth
{
    // Calling main method
    public static void main(String[] args) 
	{
		//char grade=charector.parsecharector
		String monthNumber =args[0].toLowerCase();

	switch(monthNumber)
	{
	  case "January","March","May","July","August","October" -> System.out.println("Number of Days in the month"+monthNumber+"are 31 days");
	  case "April","June","September","November" -> System.out.println("Number of Days in the month"+monthNumber+"are 30 days");
	  case "February" -> System.out.println("Number of Days in the month"+monthNumber+"are 28 days");
	  default -> System.out.println("Wrong Input"); 
	}
	//end of switch
	}
	//end of main
}
//end of class