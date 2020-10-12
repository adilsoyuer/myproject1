import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSQLStatement {
	private static String URL="jdbc:mysql://localhost:3306/hr";
	private static String DbUserName="root";
	private static String DbPassword="A6708";

	public static void main(String[] args) throws SQLException {
		Connection connection=DriverManager.getConnection(URL, DbUserName,DbPassword);
		System.out.println("Connected to MySql database...");
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("Select * from countries");
		resultSet.next();
		System.out.println(resultSet.getString("country_name") +"'s ID is " +resultSet.getString("country_id"));
		resultSet.next();
		System.out.println(resultSet.getString("country_name"));
		resultSet.close();
		statement.close();
		connection.close();
		
		
		
	}

}


