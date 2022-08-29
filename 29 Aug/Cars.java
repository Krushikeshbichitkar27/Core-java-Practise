/*
Program:Java program to implimenting class
@code by:Krushikesh
date:29/08/22
*/


//declaring class car
class Cars
{
	//creating instance variable 
	//taking properties int and string
	String model;
	String name;
	String engin;
	int price;
	int year;
	
}
void input(String m,String n,String e,int p, int y)
{
System.out.println("Model :"+model);
		System.out.println("Name:"+name);
		System.out.println("Engin:"+engin);
		System.out.println("Year :"+year);
		System.out.println("price :"+price);
}
}
void printDetails()
{
	model=m;
    name=n;
    engin=e;
	year=y;
	price=p;
}
}
class CarTest
{
	
//calling main method
	public static void main(String ...args)
	{
		// creating instance of car class
		Car k1= new Car(); //giving memory //instance of a class
		
		
		//initializing values
		k1.input("Baleno","Maruti Suzuki","Petrol",2022,750000);
		
		//calling printDetails
		k1.printDetails();
		
	}
}
