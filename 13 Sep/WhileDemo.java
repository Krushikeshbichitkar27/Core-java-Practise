/*
@ Program: print bulb status using while loop 
code by : Krushikesh
Date : 13 September 2022
*/

//creating class WhileDemo
class WhileDemo
{

	//creating method bulbStatus
 static void bulbStatus(String status) 
 {
	 if(status<10)
		 System.out.println("Bulb is OFF");
		while(status>=10)
			{
			System.out.println("Bulb is ON" + "-----Durability :" + status);
			status=5;
			}
 
 }
 
 //calling main method
 public static void main(String...args)
{
  int number=Integer.parseInt(args[0]);
  bulbStatus(durability); // for bulb Status method
  }
  }