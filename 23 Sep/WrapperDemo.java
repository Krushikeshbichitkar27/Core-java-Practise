/*
Program : programing wrapper class 
code : Krushikesh
Date : 23 September 2022
*/
// declaring the class
class WrapperDemo
{
	//calling main method
  public static void main(String args[])
  {
	  int primitiveA=5;
	  Integer objectA= Integer.valueOf(primitiveA);
	  
	  //objectA = Integer.valueOf(primitiveA);
	  //autoboxing conversion of primitive to object
	  
	  //after java 5
	  objectA=primitiveA;
	  
	  //object into primitive : unboxing
	  //Integer i= new Integer(5); //we dont need to give value 
	  Integer i=5; // we can give the value directly
	  
	  //int num=i.intValue();
	  
	  
	  int num;
	  num=i;  //after java 5 : unboxing
	
//real life example
//Integer t1= new Integer(6);
 Integer t1=6; 
t1++; //In autoboxing primitive are converting into objects automaticaly by the using java 5	
	  
	  // -------------
	  Integer g1= 127;
	  Integer g2=128;
	  System.out.println(g1.hashCode()); 
	  System.out.println(g2.hashCode()); 
	  
	  
	  System.out.println(g1==g2);  // -128 to 127
	  
	  
  }//end of main
}//end of class