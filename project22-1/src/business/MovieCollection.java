package business;

import java.util.*;
import java.util.function.Predicate;

public class MovieCollection {
private List<Movie> movies = new ArrayList<>();

public void add(Movie m) {// add Movie object to internal list
	movies.add(m);
}
public List<Movie> filterMovies(Predicate<Movie> condition){
	List<Movie> filteredMovies = new ArrayList<>();
	for (Movie m: movies) {
		filteredMovies.add(m);
	}
	
	return filteredMovies;
}
public double getLowestRating() {
	double min=movies.stream().map(m -> m.getRating())
							  .reduce(5.0, (a,b)-> Math.min(a,b));
	return min;
	
}
public double getHighestRating() {
	double max=movies.stream().map(m -> m.getRating())
			  .reduce(0.0, (a,b)-> Math.max(a,b));
return max;
	
}
public double getAverageRating() {
	double avg = movies.stream().mapToDouble(m -> m.getRating()).average().getAsDouble();
	return avg;
}
public int getSize() {//return number of items in internal list
	return 0;
	
}
public List<Movie> getMovies(){
	return movies;
	
}
}
