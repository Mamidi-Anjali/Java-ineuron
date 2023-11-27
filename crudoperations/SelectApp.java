package in.java.crudoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import in.java.util.JDBCConnection;

public class SelectApp {

	public static void selection() {
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter gender :");
		String gender = sc.next();
		String selectQuery  = "select name,address,gender,DOB,DOJ,DOM from student where gender =?";
		try {
			con = JDBCConnection.getConnection();
			if(con!=null) {
				pstmt = con.prepareStatement(selectQuery);
				if(pstmt!=null) {
					pstmt.setString(1, gender);
					rs = pstmt.executeQuery();
					System.out.println("NAME\tADDRESS\tGENDER\tDOB\t\tDOJ\t\tDOM");
					while(rs.next()) {
						java.sql.Date d = rs.getDate(4);
						//formatting the output as the user choice(based on zone)
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						String sDOB = sdf.format(d);
						d = rs.getDate(5);
						//formatting the output as the user choice(based on zone)
						sdf = new SimpleDateFormat("MM-dd-yyyy");
						String sDOJ = sdf.format(d);
						d = rs.getDate(6);
						//formatting the output as the user choice(based on zone)
						sdf = new SimpleDateFormat("yyyy-MM-dd");
						String sDOM = sdf.format(d);
						System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+sDOB+"\t"+ sDOJ+"\t"+sDOM);
					}
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
