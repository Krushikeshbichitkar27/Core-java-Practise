/*
@ Program : Defualt consturctor
code by : Krushikesh
Date 20 September 2022
*/

//declaring a Library class
class Student1
{
	//instance variable
private int id;
private String name;
private float marks;

Student1()  //no argument consturctor
{
	System.out.print("------No Argument consturctor--------");
this.id=11;
this.name="Null";
this.marks=30f;
}

Student1(int id,String name, float marks)  //parameterized consturctor
{
	System.out.print("-------parameterized consturctor--------");
this.id=id;
this.name=name;
this.marks=marks;
}

//Student(); -> default consturctor which initialize all the variable int
void display()
{
	//String course : Local variable is not initialized
	System.out.println("--------------------");
System.out.println("Id :"+id);
System.out.println("Name :"+name);
System.out.println("Marks :"+marks);
}

//calling main method
public static void main(String...args)
{
Student s=new Student();
s.display();

Student s1=new Student(21,"Krushikesh",75f);
s1.display();
}//end of main

}//emd of class