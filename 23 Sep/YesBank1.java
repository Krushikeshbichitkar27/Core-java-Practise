/*
Program: creating class YesBank to create accounts
Code: Krushikesh
Date : 23 September 2022
*/

//declaring class 
class YesBank1
{
	//calling main method
public static void main(String...args)
{
	Scanner sc= sc.Scanner(System.in);
	System.out.println("Enter the number of Students :");
	
	int size=sc.nextInt();
	YesBank y1[]=new YesBank[size];
	
	
	// loop to allocates memory
//constructor injection
for(int i=0;i<size;i++)
{
	//allocating the memory
y1[i]=new YesBank();
System.out.println("Enter the Account no :");
y1[i].setAccNo(sc.nextInt());
System.out.println("Enter the Name :");
y1[i].setAccName(sc.next());
System.out.println("Enter the Ammount :")
y1[i].setAccBalance(sc.nextDouble());
}
System.out.println("---Account with Less Balance---");



// the loop for b
	for(int i=0;i<5;i++)
	{
		if((y1[i].getAccBalance())<=1000)
		{
			System.out.println("Account Holder Name :"+y1[i].getName());
		}// end if
	}//end loop
} //end of main method
} //end of class