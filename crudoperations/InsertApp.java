package in.java.crudoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import in.java.util.JDBCConnection;

public class InsertApp {
	public static void insertion() {
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter name :");
		String name = sc.next();
		System.out.print("enter address :");
		String address = sc.next();
		System.out.print("enter gender :");
		String gender = sc.next();
		System.out.print("enter DOB :");
		String DOB = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDOB = null;
		try {
			uDOB = sdf.parse(DOB);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		long l = uDOB.getTime();
		java.sql.Date sDOB = new java.sql.Date(l);
		System.out.print("enter DOJ :");
		String DOJ = sc.next();
		sdf = new SimpleDateFormat("MM-dd-yyyy");
		java.util.Date uDOJ = null;
		try {
			uDOJ = sdf.parse(DOJ);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		l = uDOJ.getTime();
		java.sql.Date sDOJ = new java.sql.Date(l);
		System.out.print("enter DOM :");
		String DOM = sc.next();
		java.sql.Date sDOM = java.sql.Date.valueOf(DOM);

		String insertQuery  = "insert into student (name,address,gender,DOB,DOJ,DOM)values(?,?,?,?,?,?)";
		try {
			con = JDBCConnection.getConnection();
			if(con!=null) {
				pstmt = con.prepareStatement(insertQuery);
				if(pstmt!=null) {
					pstmt.setString(1, name);
					pstmt.setString(2, address);
					pstmt.setString(3, gender);
					pstmt.setDate(4, sDOB);
					pstmt.setDate(5, sDOJ);
					pstmt.setDate(6, sDOM);
					int insertedListCount= pstmt.executeUpdate();
					System.out.println("no of rows added = "+insertedListCount);
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
