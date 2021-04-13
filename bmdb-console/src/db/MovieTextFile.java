package db;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import business.Movie;
//update,delete, and getbyid wont be implemented yet
public class MovieTextFile implements DAO<Movie> {
	private static final String MOVIE_FILE_NAME ="movies.txt";
	private static final String MOVIE_UPLOAD_FILE_NAME="movie-upload.txt"
	List<Movie> movies = new ArrayList<>();
	
	public MovieTextFile() {
		getAll();
	}
	public Movie getAll() {
	//p.477
		if (movies.size()==0) {
		try {
		BufferedReader in = new BufferedReader(
							new FileReader(MOVIE_FILE_NAME));
		String line = in.readLine();
		while (line !=null) {
			String[] fields = line.split("\t");
			//after split we should have 5 fields per line (parsing lines into fields below)
			String idStr = fields[0];
			int id = Integer.parseInt(idStr);
			String title = fields[1];
			String rating = fields[2];
			String yearStr = fields[3];
			int year = Integer.parseInt(yearStr);
			String director= fields[4];
			Movie m = new Movie(id,title,rating,year,director);
			movies.add(m);
			line = in.readLine();
		}
	
		in.close();
		}
		catch (Exception e) {
			System.out.println("error getting movie records from file");
			e.printStackTrace();
		}
	}
	return movies;
	
}
	@Override
	public boolean add(Movie newMovie) {
		movies.add(newMovie);
		return saveAll();
	}
	private boolean saveAll() throws IOException {
		boolean success=true;
		Path moviesPath=Paths.get(MOVIE_FILE_NAME);
		File moviesFile=moviesPath.toFile();
		try(PrintWriter out=new PrintWriter(
						new BufferedWriter(
						new FileWriter(moviesFile)))){	//try catch the exception, in the catch;[ write boolean success=false
		//pg483-note: this looks different than example in book but works the same
		for (Movie m:movies) {
			out.println(m.getId()+"\t"+m.getTitle()+"\t"+m.getRating()+"\t"+m.getYear()+"\t"+m.getDirector());
		}
		out.close();
		}
		
		
		return success;
	}
	
	@Override
	public boolean delete(Movie m) {
		movies.remove(m);
		
	}
	@Override
	public Movie getById(int id) {
		Movie m= null;
		for(Movie movie: movies) {
			if (movie.getId()==id) {
				m=movie;
			}
		}
		return m;
		
	}
	public boolean uploadMovies() {
		boolean success=true;
		//read the upload file, adding each new movie to the movies list, then save all records to the file
		
	}
}
