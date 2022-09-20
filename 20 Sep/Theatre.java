/*
@ Program : Declaring a class and its objct
code by : Krushikesh
Date 20 September 2022
*/

//declaring a theatre class
class Theatre 
{

//declaring proprties
private String movieName;
private String movieTime;
private double ticketPrice;

//method to insert movie
void insertMovie(String movieName,String movieTime, double ticketPrice)
{
	this.movieName=movieName;
	this.movieTime=movieTime;
	this.ticketPrice=ticketPrice;
	
}

//method to display movie
void displayMovie()
{
	System.out .println("Movie Nmae :"+this.movieName+" "+"Time :"+ this.movieTime+" "+"Price :"+this.ticketPrice);
}
//end class

//declaring class movie
class Movie
{
	//calling main method
	public static void main(String...args)
	{
		//creating movie object
		Theatre movie1=new Theatre();
		movie1.insertMovie("Brahmastra","6pm,9pm",350); //implicit
		Theatre movie2=new Theatre();
		movie2.insertMovie("Avatar 3D","10am,6pm,9pm",550);
		Theatre movie3=new Theatre();
		movie3.insertMovie("Tenet","11am,6pm,9pm",450);
		
		//display input
		movie1.displayMovie();
		movie2.displayMovie();
		movie3.displayMovie();
	}//end of main
}
//end of class
}