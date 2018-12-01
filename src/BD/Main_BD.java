
package BD;

import java.sql.*;

public class Main_BD {

	public static void main(String[] args) {
		
		Connection con =null;
		try {
			Class.forName("org.sqlite.JDBC");
			con= DriverManager.getConnection("jdbc:sqlite:/Users/iraideegia/git/ProyectoProg.db");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
