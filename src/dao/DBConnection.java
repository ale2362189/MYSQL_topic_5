package dao;

public class DBConnection {
	
	private final static String URL = "jdbc:mysql://localhost:3306/recipes";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "Rom@n0980$";
	private static Connection connection;
	private static DBConnection instance;
	
	private DBConnection(Connection connection) {
		this.connection = connnection;
	}
	
	public static Connection getConnection() {
		if (instance == null) {
			try {
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				instance = new DBConnection(connection);
				System.out.println("connection successful.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return DBConnection.connection
	}

}