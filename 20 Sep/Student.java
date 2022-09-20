/*
@ Program : Defualt consturctor
code by : Krushikesh
Date 20 September 2022
*/

//declaring a Library class
class Student
{
	//instance variable
private int id;
private String name;

//Student(); -> default consturctor which initialize all the variable int
void display()
{
	//String course : Local variable is not initialized
System.out.print("Id :"+id);
System.out.print("Name :"+name);
}

//calling main method
public static void main(String...args)
{
Student s=new Student();
s.display();

}//end of main

}//emd of class