/*
@ Program: Implement scanner class

code by : Krushikesh
Date : 14 September 2022
*/
import java.util.*;
//creating class ScannerDemo
class ScannerDemo
{
	static int rollNo;
	  static String name;
	  static float marks;
	  static char gender;
  static void takeInput()
  {
	  //Scanner sc: //
	  
	   Scanner sc=new Scanner(System.in);
	   System.out.println ("Enter your roll number :");
	   rollNo=sc.nextInt();  // integer input
	  
	   System.out.println ("Enter your Name :");
	   name=sc.nextString();  // String  input
	  
	   System.out.println ("Enter your Marks :");
	   marks=sc.nextfloat();  // float input
	  
	   System.out.println ("Enter your Gender :");
	   gender=sc.next().charAt(0);  // charactor input
	  
  }
  static void displayInput()
  {
	  System.out.println ();
	  System.out.println ();
	  System.out.println ("rollNo" +rollNo);
	  System.out.println ("Name" +name);
	  System.out.println ("Marks" +marks);
	  System.out.println ("Gender"+gender);
	  
	  
	  
  }
   //calling main method
 public static void main(String...args)
 {
    takeInput(); //for takeInput
	 displayInput(); //for displayInput
	 
 }
}