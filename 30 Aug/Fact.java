/*
Program :  anonymous object
code by : Krushikesh
Date :30/08/22
*/

//declaring the class 
class Fact
{
void calcFact(int num)
{
long result=1;
while(num>0)
{
result*=num;
num--;
}
System.out.println("The factorial of number is :"+ result);
}
public static void main(String ...args)
{
System.out.println(new Fact().calcFact(0));
}
}