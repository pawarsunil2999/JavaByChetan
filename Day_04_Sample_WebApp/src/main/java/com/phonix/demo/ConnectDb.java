package com.phonix.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectDb {
		
		private static String URL = "jdbc:mysql://localhost:3306/Advanced_java";
		private static String USER = "root";
		private static String PASS = "system";
		
		public boolean isValid( String User, String Pass ) {
			
			try {
//				class load karo
				Class.forName("com.mysql.cj.jdbc.Driver");
//				connection istablish karo
				Connection conn = DriverManager.getConnection(URL, USER, PASS);
//				statment bano
				String query = "select * from idPass where username = ? and password = ?;";
				PreparedStatement stmt = conn.prepareStatement(query);				
//				execute karo
				stmt.setString(1, User);
				stmt.setString(2, Pass);

				ResultSet rs = stmt.executeQuery();
				
				return rs.next();
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
			return false;
			
			
		}
}
