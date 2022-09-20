/*
@ Program : Declaring a class and its objct using default consturctor
code by : Krushikesh
Date 20 September 2022
*/

//declaring a theatre class
class TheatreDemo 
{

//declaring instance variable
private String movieName;
private String movieTime;
private double ticketPrice;

//getter and setter method public in nature contractual behaiour
//mutator (update) setter and accessor(fetch) getter
//1st set of variable
public String getMovieName()
{
	return this.movieName;
}
public void setMovieName(String movieName)
{
	this.movieName=movieName;
}

//2nd set of variable
public void String getMovieTime()
{
	return this.movieTime;
}
public void setMovieTime(String movieTime)
{
	this.movieTime=movieTime;
}

//3rd set of variable
public String getTicketPrice()
{
	return this.Ticket;
}
public void setTicketPrice(double ticketPrice)
{
	this.ticketPrice=ticketPrice;
}

TheatreDemo()//no argument consturctor
{
	System.out.print("------No Argument consturctor--------");
this.movieName="No Name";
this.movieTime="Null";
this.ticketPrice=100f;
}

TheatreDemo(String movieName,String movieTime,double ticketPrice)//parameterized consturctor
{
	System.out.print("------parameterized consturctor--------");
this.movieName=movieName;
this.movieTime=movieTime;
this.ticketPrice=ticketPrice;
}

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
	System.out.println("--------------------");
	System.out .println("Movie Nmae :"+getMovieName+" "+"Time :"+ getMovieTime+" "+"Price :"+getTicketPrice);
}
//end class

}