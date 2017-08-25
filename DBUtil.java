import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static final String mySqlUser = "root";
	private static final String mySqlPWD = "mypass";
	private static final String mySQLCS = "jdbc:mysql://localhost:3306/?user=root&password=rootpassword\');";
// i have tried different code which either gives the console
//	Access denied for user 'root'@'localhost' (using password: YES)  which is this instant or 
	// Access denied for user 'root'@'localhost' (using password: no) 
	// The best I can get it is tried three times to hit the connection but ran out of time
	
	public static Connection getConnection(DBType dbType) throws SQLException {
		switch (dbType) {
		case MYSQLDB:
			return DriverManager.getConnection(mySQLCS, mySqlUser, mySqlPWD);
		
		default:
			
			return null;
		
		}
	}
	
}

// original file before I start messing with it
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class TestMySQLConnection {
//
//	static String username = "root";
//	static String password = "root";
//	static String dbUrl = "jdbc:mysql://localhost:3306/world";
//	
//	public static void main(String[] args) throws SQLException {
//		// TODO Auto-generated method stub
//		
//		Connection conn = null;
//		try {
//			conn = DriverManager.getConnection(dbUrl, username, password);
//			
//			System.out.println("Connection Established to MYSQL Database");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			System.err.println(e.getMessage());
//		}
//		finally{
//			conn.close();
//		}
//		
//		
//	
//
//	}
//
//}

