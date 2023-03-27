package crud.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conexion {
	// Credentials
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/company";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASSWORD = "";
	private static final String JDBC_NAME = "com.mysql.cj.jdbc.Driver";
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(JDBC_NAME);
			System.out.println("Successful connection");
		} catch (Exception e) {
			System.out.println("Failed to load driver");
		}
		try {
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		} catch (Exception e) {
			System.out.println("Error connecting to the DB");
		}
		return conn;
	}
	public static void Close(ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
	public static void Close(PreparedStatement rs) {
		try {
			rs.close();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
	public static void Close(Connection rs) {
		try {
			rs.close();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
}