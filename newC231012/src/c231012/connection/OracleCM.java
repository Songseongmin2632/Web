package c231012.connection;

import java.sql.Connection;
import java.sql.DriverManager;

// Oracle DB와 통신하는 Connection 생성
public class OracleCM implements ConnectionMaker {
	String url = "jdbc:oracle:thin:@localhost:1521/xe";
	@Override
	public Connection makeConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		
		return DriverManager.getConnection(
				url,
				"java",
				"qwer"
			);
		
	}
}
