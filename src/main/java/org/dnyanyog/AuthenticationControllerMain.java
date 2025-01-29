package org.dnyanyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class AuthenticationControllerMain {
	
	@GetMapping("/data")
	public String data() throws SQLException {

		String url = "jdbc:mysql://127.0.0.1:3306/usermanagement";
		String username = "root";
		String pass = "Manthan@000";

		Connection connection = DriverManager.getConnection(url, username, pass);

		Statement statement = connection.createStatement();

		String query = ("select * from e_commerce.user");
		ResultSet result = statement.executeQuery(query);
		String name ="";
		while(result.next()) {
		System.out.println("User ID: " + result.getString(1));
		name = result.getString(2);
		System.out.println("password: " + result.getString(3));
		System.out.println("Gmail: " + result.getString(4));
		
	}
		return name;

	}
}
	


