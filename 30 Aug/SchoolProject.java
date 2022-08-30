/*
Program :  program for default constructur
code by : Krushikesh
Date :30/08/22
*/

import static java.lang.System,*;


//declaring the class 
class SchoolProject
{
int p_id;
String projectName;
String subject;
float marks;
boolean status;
}
// TestProject(); - default constructur
//no - args constructur

SchoolProject()
{
projectName="null";
subject="AWP";
marks=2.0f;
}

//parameterized constructur1
SchoolProject(int P_id,String projectName,String subject,float marks,boolean status)
{
	this.p_id=p_id;
	this.projectName=projectName;
	this.subject="JAVA";
	this.marks=marks;
	this.status=status;
}


void printStatus()
{
	if(status)
	{
	out.println("Project id :"+p_id);
	out.println("Project name :"+projectName);
	out.println("Project subject :"+subject);
	out.println("Project marks :"+marks);
	out.println("Project approval status :"+status);
	}
	else
	{
		out.println("project id :"+p_id+"is not approved");
	}
}
}
}
class ProjectTest()
{
	public static void main(String...args)
	{
		TestProject ab= new TestProject();//no args constructur
		TestProject ab1= new TestProject(110,"college management","SPM",68.0f,true);
		TestProject ab2= new TestProject(111,"Farm management","IOT",78.0f,false);
		TestProject ab3= new TestProject(112,"Farm management","IOT",88.0f,false);
		TestProject ab4= new TestProject(113,"Farm management","IOT",82.0f,false);
		
		out.println();
		ab.printStatus();
		
		out.println();
		ab1.printStatus();
		
		out.println();
		ab2.printStatus();
		
		out.println();
		ab3.printStatus();
		
		out.println();
		ab4.printStatus();
	}
}