/*
Program:Java program to implimenting class
@code by:Krushikesh
date:29/08/22
*/


//declaring class car
class Car
{
	//creating instance variable 
	//taking properties int and string
	String model;
	String name;
	String engin;
	int price;
	int year;
	
	//method to print car details
	void displayValue()
	{
		String company="Maruti Suzuki";  //loacal variable
		System.out.println("Model :"+model);
		System.out.println("Name:"+name);
		System.out.println("Engin:"+engin);
		System.out.println("Year :"+year);
		System.out.println("price :"+price);
	}
	//calling main method
	public static void main(String ...args)
	{
		//creating an object of class car
		Car c1= new Car(); //giving memory //instance of a class
		//initialize the fiel of object
		c1.model="Lxi";
		c1.name="Maruti Suzuki Dzire";
		c1.engin="Petrol";
		c1.year=2022;
		c1.price=600000;
        
		//creating an object of class car
		Car c2= new Car(); //giving memory //instance of a class
		//initialize the fiel of object
		c2.model="Zxi";
		c2.name="Baleno";
		c2.engin="Desiel";
		c2.year=2021;
		c2.price=700000;
		
		//printing the display value of car
		c1.displayValue();
		c2.displayValue();
			
	}
}//end code
