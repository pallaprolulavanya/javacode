package com.destination.sqlcrudoperations.all;

import java.sql.Connection;
import java.sql.DriverManager;

public class creating {

	private Connection con;

	public creating() {
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
			java.sql.Statement stmt= con.createStatement();
			int x=stmt.executeUpdate("create table student (id int,name varchar(60))");
			if (x>=0) {
				System.out.println("Table  was Created");
			}
			else {
				System.out.println("Table creation was failed");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
