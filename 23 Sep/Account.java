/*
Program: Write a  java program to create a BankAccount and display the people with balance less than 1000. 
Code: Krushikesh
Date : 23 September 2022
*/

//declaring class 
class Account
{
private int accNo;
private String accName;
private double accBalance;

//no args constructor
Account()
{

}

//parameterizie constructor
Account(int accNo, String accName, double accBalance)
{
this.accNo=accNo;
this.accName=accName;
this.accBalance=accBalance;
}

//getter and setter for accNo
void setAccNo(int accNo)
{
this.accNo=accNo;
}
int getAccNo()
{
return this.accNo;
}

//getter and setter for accName
void setAccName(String accName)
{
this.accName=accName;
}
String getAccName()
{
return this.accName;
}

//getter and setter for accBalance
void setAccBalance(double accBalance)
{
this.accBalance=accBalance;
}
double getAccBalance()
{
return this.accBalance;
}

}