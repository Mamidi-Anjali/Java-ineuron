package in.java.crudoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import in.java.util.JDBCConnection;

public class DeleteApp {

	public static void deletion() {
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter sname :");
		String sname = sc.next();
		String deleteQuery  = "delete from student where name=? ";
		try {
			con = JDBCConnection.getConnection();
			if(con!=null) {
				pstmt = con.prepareStatement(deleteQuery);
				if(pstmt!=null) {
					pstmt.setString(1, sname);					
					int deleteListCount= pstmt.executeUpdate();
					System.out.println("no of rows deleted = "+deleteListCount);
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
