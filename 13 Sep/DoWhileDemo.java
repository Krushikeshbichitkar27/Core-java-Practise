/*
@ Program: print bulb status using do while loop 
code by : Krushikesh
Date : 13 September 2022
*/

//creating class DoWhileDemo
class DoWhileDemo
{

	//creating method bulbStatusDo
 static void bulbStatusDo(String status) 
 {
	   do  //
		   {
			status=5;  //its runging first this condition if we put after system.out.println its not geting its printing while condition
			System.out.println("Bulb is ON" + "-----Durability :" + status);
			
			}while(status>=10)
         if(status<10)
		     System.out.println("Bulb is OFF");
 }
 
 //calling main method
 public static void main(String...args)
{
  int number=Integer.parseInt(args[0]);
  bulbStatusDo(durability); // for bulb Status method
  }
  }