import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
//import oracle.jdbc.OracleDriver;

public class ConnectionDemo {

	public static void main(String[] args) {
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";	// Oracle
//		String url = "jdbc:mysql://localhost:3306/training";

		try {
			// OracleDriver driver = new OracleDriver(); // Oracle
//			Driver driver = new Driver(); // MySQL
//			DriverManager.registerDriver(driver);
//			Connection conn = DriverManager.getConnection(url, "zubair", "oracle");
			Connection conn = JdbcFactory.getConnection();
			System.out.println("Connection successful");

			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB Name: " + meta.getDatabaseProductName());
			System.out.println("DB Ver: " + meta.getDatabaseProductVersion());
			System.out.println("Driver Name: " + meta.getDriverName());
			System.out.println("Driver Ver: " + meta.getDriverVersion());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
