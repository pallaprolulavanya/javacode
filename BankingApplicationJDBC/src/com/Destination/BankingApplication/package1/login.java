package com.Destination.BankingApplication.package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class login {
	public static String customerId;
	public static String password;
	private Connection con;
	
	public String getcustomerId() {
		return customerId;
	}

	public void setcustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
	

	public login() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/dest_projects","root","root");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean validate() {
		try {
			String query = "select * from login where emailId=? and password=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1,customerId);
			pstmt.setString(2,password);
			
			ResultSet resultSet = pstmt.executeQuery();
			if(resultSet.next()==true) {
				return true;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
}
