/*
@ Program : Java program to print grade using charector function
code by : Krushikesh
Date 09 September 2022
*/

//declaring class
class SwitchDemo1 
{
    // Calling main method
    public static void main(String[] args) 
	{
	char grade='C';
	switch(grade)
	{
	 case 'A'-> System.out.println("Pass : Excellent");  //-> Expression level //printing
	 case 'B'-> System.out.println("Pass : Very good");    //-> Expression level //printing
	 case 'C'-> System.out.println("Pass : Good");      //-> Expression level //printing
	 case 'D'-> System.out.println("Pass : Can Do Better");    //-> Expression level //printing
	 case 'F'-> System.out.println("Fail");      //-> Expression level //printing
	
	 default ->System.out.println("Wrong input");  // //-> Expression level //printing
	}
	//end of switch
	}
	//end of main
}
//end of class