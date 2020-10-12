import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionDemo {
	private static String URL="jdbc:mysql://localhost:3306/hr";
	private static String DbUserName="root";
	private static String DbPassword="A6708";
	
	//private static String oraURL="jdbc:oracle:thin:@localhost:1521:xe";
	//private static String oraDbUserName="hr";
	//private static String oraDbPassword="hr";
	
	public static void main(String[] args) throws SQLException {
		Connection connection=DriverManager.getConnection(URL, DbUserName,DbPassword);
		System.out.print("MySq database Connection successful");
		
		if(connection!=null) {
			connection.close();
		}
	}
}
