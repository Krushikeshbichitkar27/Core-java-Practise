/*
Program :  program for using defult constructur
code by : Krushikesh
Date :30/08/22
*/

//declaring the class 
class CollegeProject
{
int p_id;
String projectName;
String subject;
float marks;
boolean status;

void printStatus()
{
	System.out.println("Project id :"+p_id);
	System.out.println("Project name :"+projectName);
	System.out.println("Project subject :"+subject);
	System.out.println("Project marks :"+marks);
	System.out.println("Project approval status :"+status);
}
class ProjectTest
	{
		public static void main(String...args)
		{
		collegeProject c1 = new collegeProject(); // no arg constructur
		c1.printStatus();
		}
	}
}