import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static final String mySqlUser = "root";
	private static final String mySqlPWD = "mypass";
	private static final String mySQLCS = "jdbc:mysql://localhost:3306/?user=root&password=rootpassword\");";
	
	public static Connection getConnection(DBType dbType) throws SQLException {
		switch (dbType) {
		case MYSQLDB:
			return DriverManager.getConnection(mySQLCS, mySqlUser, mySqlPWD);
		
		default:
			
			return null;
		
		}
	}
	
}
