package db;


import java.sql.*;

import business.User;

public class UserDb {
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb";
		String userName = "bmdb_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbURL, userName, password);
		return conn;
}
	public User login(String un, String pwd) {
		User u = null;
		String sql = "select * from user"
					+ "where username = ?"
					+"      and password = ?";
		try (Connection conn= getConnection();
				PreparedStatement pas = conn.prepareStatement(sql)){
			ps.setString(1,un);
			ps.setString()
		}
	catch (SQLException e) {
		System.out.println("Exception during user login");
	}
	}
	private User getUserFromResultSet(ResultSet rs) throws SQLException {
		int id=rs.getInt(1);
		
	}
	
	
}