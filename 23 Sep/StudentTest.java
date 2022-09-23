/*
Program: 
Code: Krushikesh
Date : 23 September 2022
*/


class StudentTest
{
public static void main(String...args)
{
Student s[]=new Student[5];

s[0]=new Student(21,"Krushikesh",89);
s[1]=new Student(22,"Rahul",98);
s[2]=new Student(23,"Pooja",90);
s[3]=new Student(24,"Raj",87);
s[4]=new Student(25,"Rani",79);

for(int i=0;i<5;i++)
{
       if((s[i].getMarks())>=90)
		{
			System.out.println("Account Holder Name :"+s[i].getName());
		}// end if
}
}
}