package com.xworkz.interior;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.interior.dto.InteriorDTO;

public class SumanaTester {

	public static void main(String[] args) throws Exception {
		try {
			
			/*
			 * int id = 3; String name = "Gagan"; int forWhat = 3; double dim = 1200; double
			 * budget = 500000;
			 */
			// or
			InteriorDTO dto = new InteriorDTO();
			dto.setHid(4);
			dto.setMestriName("Sham");
			dto.setForWhat(3);
			dto.setDimension(800);
			dto.setBudget(200000);
			System.out.println("class found,connection successfull");
		try(
		Connection jdbcConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "root123"))
		{
			// String query = "insert into interior values(1,'Ram',2,1000,300000)";
			StringBuffer sql = new StringBuffer("insert into interior values");
			sql.append("(").append(dto.getHid()).append(",").append("'").append(dto.getMestriName()).append("'")
					.append(",").append(dto.getForWhat()).append(",").append(dto.getDimension()).append(",")
					.append(dto.getBudget()).append(")");
			// System.out.println(query);
			System.out.println(sql.toString());

			Statement stmt = jdbcConn.createStatement();
			// boolean isResultSet=stmt.execute(query);
			boolean isResultSet = stmt.execute(sql.toString());
			System.out.println(isResultSet);
			//jdbcConn.close();
			
			//Closeable,AutoCloseable
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
