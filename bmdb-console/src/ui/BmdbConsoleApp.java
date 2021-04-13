package ui;
im
import java.io.*;
import java.nio.file.*;
import java.util.*;
import util.Console;
import business.Movie;
import business.User;
import db.DAOUploadable;
import db.MovieDB;
import db.UserDb;
//update your console class, its missing methods that cause compile errors around line 18 that are now commented out
public class BmdbConsoleApp {
	private static DAOUploadable<Movie> movieDAO = new MovieDB();
	private static UserDb userDB = new userDb
	//private static final String MOVIE_FILE_NAME ="movies.txt";
	public static void main(String[] args) throws IOException {
		System.out.println("welcome to the bootcamp movie database");
		String command= "";
		while(!command.equalsIgnoreCase("exit")) {
			System.out.println("MENU: ");
			System.out.println("Show - show all movies");
			System.out.println("Add - add a movie");
			System.out.println("Get - get a movie by id");
			System.out.println("Delete - delete a movie by id");
			System.out.println("Upload - Upload new movies from upload file");
			System.out.println("Login - ");
			System.out.println("Exit - exit app");
			//String[] validEntries = {"show", "add", "exit"};
			//command = Console.getChoiceString("Command: ", validEntries)
			command = Console.getString("Command: ");
			switch (command) {
			case "show":
				// read all records from file and print to screen
				List<Movie> movies = movieDAO.getAll();
				System.out.println("Movie List: ");				
				System.out.println("============");
				if (movies.size() !=0) {
					for (Movie m :movies) {
						System.out.println(m);
					}
				}
				else {
					System.out.println("Movie File Empty");
				}
				break;
			case "add":
				//prompt user for all fields for a movie, create instance of movie, then call writeMovieRecord
				System.out.println("Add a Movie:");
				System.out.println("============");
				int id = Console.getInt("Id: ", 0, Integer.MAX_VALUE);
				String title = Console.getString("Title: ");
				String rating = Console.getString("Rating: ");
				int year = Console.getInt("Year: ", 0, Integer.MAX_VALUE);
				String director = Console.getString("Director: ");
				Movie m = new Movie(id, title, rating, year, director);
				if(movieDAO.add(m)) {
					System.out.println("Movie Added");
				}
				else {
				System.out.println("Error adding movie");	
				}
				break;
			case "get":
				System.out.println("Get a movie");
				System.out.println("===========");
				id = Console.getInt("Movie ID:", 0, Integer.MAX_VALUE);
				Movie movie = movieDAO.getById(id);
				if (movie !=null) {
					System.out.println(movie);
				}
				else {
					System.out.println("Invalid movie id");
				}
				break;
			case "delete":
				System.out.println("Delete a movie");
				System.out.println("==============");
				id = Console.getInt("Movie ID:", 0, Integer.MAX_VALUE);
				movie = movieDAO.getById(id);
				if (movie !=null) {
					movieDAO.delete(movie);
					System.out.println("Movie successfuly deleted");
				}
				else {
					System.out.println("Invalid movie id");
				}
				
				break;
			case "exit":
				
				break;
				
			case "login":
				System.out.println("User Login:");
				System.out.println("=============");
				String un = Console.getRequiredString("Username: ");
				String pwd = Console.getRequiredString("Password: ");
				User authenticatedUser = userDB.login(un, pwd);
				if (authenticatedUser==null) {
					System.out.println("Invalid Login");
				}
				else {
					System.out.println("Successful login.  Welcome, "+authenticatedUser.getFirstName());
				}
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Yeah, you'd better leave");

	}
	//p.467, here deviates from book example
/*private static void writeMovieRecord(Movie m) throws IOException {
	Path moviesPath=Paths.get(MOVIE_FILE_NAME);
	File moviesFile=moviesPath.toFile();
	PrintWriter out=new PrintWriter(
					new BufferedWriter(
					new FileWriter(moviesFile)));	
	out.println(m.getId()+"\t"+m.getTitle()+"\t"+m.getRating()+"\t"+m.getYear()+"\t"+m.getDirector());
	out.close();
	
}*/
// read movie records and return a list of movies
	/*private static List<Movie> readMovieRecord() throws IOException {
		List<Movie> movies = new ArrayList<>();
		//p.477
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
		return movies;*/
	}
	
	
	
	
	
}
