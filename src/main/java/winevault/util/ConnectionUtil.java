package main.java.winevault.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	public static Connection getConnection(IConnectionData data) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(data.getURL(),data.getUser(),data.getPassword());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
