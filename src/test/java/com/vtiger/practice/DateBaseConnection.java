
package com.vtiger.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DateBaseConnection {
	public static void main(String[]args)  {
		Connection connection=null;
		try {
			//step1:-Create object for implemention class
			Driver driver=null;
			try {
				driver = new Driver();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Driver object not created");
			}
			//step2:-Register the Driver with JDBC
			try {
				DriverManager.registerDriver(driver);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Driver not register");
			}
			//step3:-Establish the connection
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Connection to data base is failure");
			}
			//step:-4 Create the statement
			Statement statement = null;
			try {
				statement = connection.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("creating statemnt get failure");
			}
			//step:-5 Execute the Query
			ResultSet result=null;
			try {
				result = statement.executeQuery("select * from sdet34");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("query not exceuted");
			}
			//step:-6 Validate
			try {
				while(result.next())
				{
					System.out.println(result.getString(2));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("getting data from data base failure");
			}

		}
		finally {
			//step:-7 close the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("DB not closed");
			}

		}



	}
}
