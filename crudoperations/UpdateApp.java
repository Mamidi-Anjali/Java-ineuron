package in.java.crudoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import in.java.util.JDBCConnection;

public class UpdateApp {

	public static void updation() {
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
	
		String deleteQuery  = "update student set address=? where name=?";
		try {
			con = JDBCConnection.getConnection();
			if(con!=null) {
				pstmt = con.prepareStatement(deleteQuery);
				if(pstmt!=null) {
					System.out.println("enter the sname u want to change");
					String setName = sc.next();
					
					System.out.println("enter the value u want to change for the address");
					String value = sc.next();
					pstmt.setString(1, value);
					pstmt.setString(2, setName);		
					int updatedListCount= pstmt.executeUpdate();
					System.out.println("no of rows updated = "+updatedListCount);
				}
			}
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				JDBCConnection.closeConnection(con, pstmt, rs);
				if(sc!=null)
					sc.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}



}
