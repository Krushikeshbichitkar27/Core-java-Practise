/*
@ Program: Phone Charging
code by : Krushikesh
Date : 13 September 2022
*/

//creating class PhoneCharge
class PhoneCharge()
{

	//creating method startCharging
 static void startCharging(int batteryLife)
 {
	 while(batteryLife<100)
	 {
		 System.out.println("----Charging-----");
		 batteryLife+=15;
		 if(batteryLife>=100)
			 
		 
   if(batteryLife>=100)
   {
   System.out.println("----Your phone is completely Charged(100%)-----");
   }
 }// end of startCharging method
 
 
 //calling main method
public static void main(String...args)
{
	int battery=Integer.parseInt(args[0]);
	startCharging(battery); //printing method startCharging
}//end of main method 
}// end of class