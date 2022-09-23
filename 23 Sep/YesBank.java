/*
Program: creating class YesBank to create accounts
Code: Krushikesh
Date : 23 September 2022
*/

//declaring class 
class YesBank
{
	//calling main method
public static void main(String...args)
{
YesBank y[]=new YesBank[5];

//constructor injection
y[0]=new YesBank(11021,"Krushikesh",1089);
y[1]=new YesBank(12022,"Rahul",799);
y[2]=new YesBank(11223,"Pooja",1100);
y[3]=new YesBank(14524,"Raj",899);
y[4]=new YesBank(45725,"Rani",7309);

// the loop for b
	for(int i=0;i<5;i++)
	{
		if((y[i].getAccBalance())<=1000)
		{
			System.out.println("Account Holder Name :"+y[i].getName());
		}// end if
	}//end loop
} //end of main method
} //end of class
