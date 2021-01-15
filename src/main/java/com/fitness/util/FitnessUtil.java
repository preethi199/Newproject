package com.fitness.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FitnessUtil {
	
	static Connection con = null;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineFitness","Priyanka","PRI@24ya");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

}
