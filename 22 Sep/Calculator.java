/*
Program : Static calculator 
Code: Krushikesh
Date: 22 September 2022
*/


import java.util.Scanner;
class Calculator
{
static double answer=0.0;

double addition(double num1, double num2)
{
	return num1+num2;
}
double substraction(double num1, double num2)
{
	return num1-num2;
}
double multiplictaion(double num1, double num2)
{
	return num1*num2;
}
double division(double num1, double num2)
{
	return num1/num2;
}

public static void main(Striong...args)
[
Scanner sc =new Scanner(St=ystem.in);
double number1,number2;
char operator;

System.out.println("-----Calculator-----");
System.out.println("Enter 2 number :");

number=sc.nextDouble();
number2=sc.nextDouble();

Calculator ca1=new Calculator();
while(true)
{
System.out.println("Enter the operator : ");
operator=sc.next().charAt(0);
switch(operator)
{
case'+': Calculator.answer=ca1.addition(number1+number2);
break;	
case'-': Calculator.answer=ca1.substraction(number1-number2);
break;	
case'*': Calculator.answer=ca1.multiplictaion(number1*number2);
break;	
case'/': Calculator.answer=ca1.division(number1/number2);
break;	
default : System.out.println("Wrong input");
}

System.out.println(number1+""+operator+""+number2+""+calculator.ans);
System.out.println("Do you wnat to perform more operation");
operator=sc.next().toLowerCase().charAt(0):

if (choice=='y')
{
	number1=calculator.ans;
	System.out.println("Enter the number :");
	number2=sc.nextDouble();
}
else
{
	break;
}
}



}