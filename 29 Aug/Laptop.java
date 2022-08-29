/*
Program:Java program to implimenting class
@code by:Krushikesh
date:29/08/22
*/


//declaring class laptop
class Laptop
{
	//creating instance variable 
	//taking properties int and string
	String model;
	String name;
	int price;
	int gen;
}
void input(String m,String n,int p, int g)
{
        System.out.println("Model :"+model);
		System.out.println("Name:"+name);
		System.out.println("Genaration :"+gen);
		System.out.println("price :"+price);
}
void inputDetails()
{	
     //initalizing instance variable
	model=model;
    name=name;
	generation=gen;
	price=price;
       
}
//calling main method
	public static void main(String ...args)
	{
		// creating instance of laptop class
		Laptop c1= new Laptop(); //giving memory //instance of a class
		
		
		//initializing values
		c1.input("Asus","ZenBook Flip 13",8,85000);
		
		//calling printDetails
		c1.inputDetails();
		
	}
}