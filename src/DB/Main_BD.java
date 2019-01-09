
package DB;

import java.sql.*;

public class Main_BD {

	public static void main(String[] args) {

		Connection con =null;
		try {
			Class.forName("org.sqlite.JDBC");
			con= DriverManager.getConnection("DBProg3.db");
		} catch (Exception e) {
			System.out.println(e);
		}


	}
	public void guardarcont() //Guarda contador //Cap 3
	{

	}

	public void guardarcontenemigo()
	{

	}

	public void guardarpunt()
	{

	}

}
