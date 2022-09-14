/*
Program :  Creating array 
code by : Krushikesh
Date :14 September 2022
*/
class ArrayDemo1
{
	//int myArray[];  // creating a reference of array
	//myArray=new int[3];
static void printArray(int num1,int num2,int num3) //passing values to array
{
	int []myArray =new int[3];
	myArray[0]=num1; //storing first element
    myArray[1]=num2;
	myArray[2]=num3;
	for(int i=0;i<myArray.length;i++)
	{
	System.out.println("Element is"+i+":"+myArray[i]);
	}	
}	
static void initArray()
{
	int newArray[]={10,20,30,40,50,60,70}; //implicit array
	System.out.println("Size of newArray:"+myArray.length);
	for(int i=0;i<myArray.length;i++)
	{
		System.out.println("Element is"+(i+1)+":"+myArray[i]);
	}

        //calling main method
		public static void main(String args[])
		{
			//printing the element
		//printArray(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		initArray();
		}
	}