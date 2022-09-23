/*
Program : Static variable vs instance variable 
Code: Krushikesh
Date: 22 September 2022
*/

class Person
{
  //instance variablr
  private String name;
  private int age;
  private String gender;
  private static String colony;
  
  Person()// no args constructor
  {
	  
  }
  
  Person(String name, int age,String gender)// Parameteriz constructor
  {
	  this.name=name;
	  this.age=age;
	  this.gender=gender;
	  colony="Swarg";
  }
  
  static void colonyChange(String)  
  {
	  colony=colonyName;
  }
  static String getColony()
  {
	  return colony;
  }
  //static method can access only static variable and they can access instance variable through
  void display()
  //non static method can access both static and non static variable
  {
	  colony="Mamta";
	  System,out.println("Name :"+this.name+"Age :"+this.age+"Gender ;"+this.gender);
  }
  }