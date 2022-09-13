/*
@ Program: break and continue
code by : Krushikesh
Date : 12 September 2022
*/

//creating class ForLoop
class BreakContinue
{

	//creating method printNumbers
 static void printNumbers() //methodto print number
 {
	 for (int i=1; i<=10;i++)
	 {
		 if(i==5)
		 {
			 break; // its comes out of the loop
		 }
	    System.out.println(i);
	 }
}

//creating method printNumbers1
 static void printNumbers1() //methodto print number
 {
	 for (int i=1; i<=10;i++)
	 {
		 if(i==5)
		 {
			 continue; //its skips that perticular value 
		 }
	    System.out.println(i);
	 }
}
	//creating method printNumbers2
 static void printNumbers2() //unlabeled  break and continue
 {
	 for (int i=1; i<=3;i++)
	 {
	    System.out.println(i);
		for(int j=1;j<=3;j++)
		{
			//if(i==j)
				//break; //breaking inner loop
			 //continue;  // breaking only the inner loop 
			System.out.println(i+""+j+" ");
		}
	 }
}
	//creating method printNumbers2
 static void printNumbers3() //unlabeled  break and continue
 {
	 outerLoop: for (int i=1; i<=3;i++)
	 {
	    System.out.println(i);
		for(int j=1;j<=3;j++)
		{
			//if(i==j)
				break outerLoop; //breaking outer loop showing nothing
			 //continue outerLoop;  // breaking only the outer loop 
			System.out.println(i+""+j+" ");
		}
	 }
}
	
	//calling main method
public static void main(String...args)
{
	
	//printNumbers(); //printing method printNumbers
	//printNumbers1(); //printing method printNumbers1
	System.out.println("Continue Statement");
	printNumbers2(); //printing method printNumbers2
	System.out.println("Discontinue Statement");
	printNumbers3(); //printing method printNumbers3
	
}
}