package in.java.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {
	
	private JDBCConnection() {
		
	}
	public static Connection getConnection() throws SQLException {
		Connection con = null;
		
		String url ="jdbc:mysql://localhost:3306/data";
		String username = "root";
		String pwd = "root";
		
		con = DriverManager.getConnection(url,username,pwd);
		return con;
	}
	
	public static void closeConnection(Connection con, Statement stmt, ResultSet rs) throws SQLException {
		
		if(rs!=null)
			rs.close();
		if(stmt!=null)
			stmt.close();
		if(con!=null)
			con.close();
	}
}
