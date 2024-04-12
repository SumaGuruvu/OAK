
public class Movie {
	private String MovieName;
	private String company;
	private String genre;
	private int budget;
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "Movie [MovieName=" + MovieName + ", company=" + company + ", genre=" + genre + ", budget=" + budget
				+ "]";
	}
	
	
}
