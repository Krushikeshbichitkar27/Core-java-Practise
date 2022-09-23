/*
Program : Static variable vs instance variable 
Code: Krushikesh
Date: 22 September 2022
*/

class PersonTest
{
public static void main(String...args)
{
Person p1=new Person("Patil",44,"Male");
Person p2=new Person("Rane",34,"Male");
Person p3=new Person("Shushma",28,"Female");

Person.colonyChange("Swarg");

System.out.println("---------");
p1.display();
System.out.println("--------");
p2.display();
System.out.println("---------");
p3.display();
}
]