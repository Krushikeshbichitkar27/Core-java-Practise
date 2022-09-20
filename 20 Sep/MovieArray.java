//declaring class movie Array
class MovieArray
{
	//calling main method
	public static void main(String...args)
	{
		//creating array of movie
		Theatre movie[]=new Theatre[5];
		
		//creating object
		movies[0]=new Theatre("KGF","6pm,9pm",350");
		movies[1]=new Theatre("Avatar","6pm,9pm",450");
		movies[2]=new Theatre("KGF2","6pm,9pm",250");
		movies[3]=new Theatre("Tenet","6pm,9pm",350");
		movies[4]=new Theatre("Lord of the Ring","6pm,9pm",475");
		
		//displaying all the movies in the theatre
		for(int i=0;i<movies.length;i++)
		{
			movies[i].displayMovie();
		}
		
		System.out.println("-------setter injected object--loosely coupled ---better  approach----");
		Theatre t1=new Theatre();
		t1.setMovieName("Sholay");
		t1.setMovieTime("Forever");
		t1.setTicketPrice(100.99);	
		t1.displayMovie();
		
		
		System.out.println("-------consturctor injected object--yightly coupled -------");
		Theatre t2=new Theatre("Tenet","6pm,9pm",350");
		t2.displayMovie();
		
		}//end of main
}
//end of class
