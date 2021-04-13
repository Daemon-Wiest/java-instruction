package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.Movie;

public class MovieDB implements DAOUploadable<Movie> {
	// pg677 all CRUD methods will use this to get a connection to the DB
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb";
		String userName = "bmdb_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbURL, userName, password);
		return conn;
	}

	@Override
	public List<Movie> getAll() {
		List<Movie> movies = new ArrayList<>();
		String sql = "select * from movie";
		Statement stmt = getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			int id = rs.getInt(1);
			String title = rs.getString(2);
			int year = rs.getInt(3);
			String rating = rs.getString(4);
			String director = rs.getString(5);
			Movie m = new Movie(id, title, rating, year, director);
			movies.add(m);
		}
		return movies;
	}

}
