package metier;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	private static Connection connection;
	/*
	 * Un bloc static s'execute au moment du chargement de la classe en mémoire
	 * Et comme la classe est chargée une seule fois un bloc static s'execute une seule fois
	 * Ce qui garantie la création d'une seule connection
	 */
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CAT_PROD","root","lemine");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection() {
		return connection;
	}

}
