/*
Program : programing varargs in command line
code : Krushikesh
Date : 24 Augest 2022
*/
// declaring the class
class VarargsDemo2
{
	public static void main(String ... args)
	{
		for(int i:args)
		{
			System.out.println(i);
		}
	}
}