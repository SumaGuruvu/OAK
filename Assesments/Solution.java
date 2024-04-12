import java.util.Scanner;
public class Solution{
    static void getMovieByGenre(Movie movie[],String searchGenre)
	{
    	Movie m1[]=new Movie[movie.length];
    	for(int i=0;i<movie.length;i++)
    	{
//    		System.out.println(movie[i].getGenre());
    		if(movie[i].getGenre().equals(searchGenre))
    		{

    			m1[i]=movie[i];
    			System.out.println(m1[i]);
    		}
    	}
    	for(int i=0;i<m1.length;i++) {
    		if(m1[i].getBudget()>80000000)
    		{
    			System.out.println("High Budget");
    		}
    		else
    		{
    			System.out.println("low budget");
    		}
    	}
	}
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	String searchGenre=sc.nextLine();
    	  Movie a[]=new Movie[4];
       
        for(int i=0;i<a.length;i++) {
        	 Movie m=new Movie();
    	   System.out.println("enter moviename:");
    	   String moviename=sc.nextLine();
    	    m.setMovieName(moviename);
    	   System.out.println("enter company:");
    	   String company=sc.nextLine();
    	    m.setCompany(company);
    	   System.out.println("enter genre");
    	   String genre=sc.nextLine();
    	   m.setGenre(genre);
    	   System.out.println("enter budget");
    	   int budget=sc.nextInt();
    	   m.setBudget(budget);
    	   sc.nextLine();
    	   a[i]=m;
    	  // System.out.println(a[i]);
        }
      
        getMovieByGenre(a,searchGenre);
        
    }
}

