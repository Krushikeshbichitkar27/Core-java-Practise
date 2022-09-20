/*
@ Program : Declaring a class and its objct
code by : Krushikesh
Date 20 September 2022
*/

//declaring a Library class
class Library1 
{

//declaring proprties
private String bookName;
private String bookAuthor;
private double bookPrice;

//method to insert book
void insertMovie(String bookName,String bookAuthor, double bookPrice)
{
	this.bookName=bookName;
	this.bookAuthor=bookAuthor;
	this.bookPrice=bookPrice;
	
}
Library1()   //no argument consturctor
{
	System.out.print("------No Argument consturctor--------");
this.bookName="No Name";
this.bookAuthor="Null";
this.bookPrice=70f;
}

Library1(String bookName, String bookAuthor,bookPrice)  //parameterized consturctor
{
	System.out.print("------parameterized consturctor--------");
this.bookName=bookName;
this.bookAuthor=bookAuthor;
this.bookPrice=bookPrice;
}

//method to display Book
void displayBook()
{
	System.out.println("Book Name :"+this.bookName+" "+"Author :"+ this.bookAuthor+" "+"Price :"+this.bookPrice);
}
//end class

//declaring class Book
class Book
{
	//calling main method
	public static void main(String...args)
	{
		//creating book object
		Library book1=new Library();
		//book1.insertBook("Wings of Fire","Abdul Kalam",699); //implicit
		Library book2=new Library();
		//book2.insertBook("A Millon Thousand ","Astha anand",99);
		Library book3=new Library();
		//book3.insertBook("The Indian Story","Bimal jala",300);
		
		//display input
		book1.displayBook();
		book2.displayBook();
		book3.displayBook();
	}//end of main
}
//end of class
}