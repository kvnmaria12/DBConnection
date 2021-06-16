import java.sql.*;

public class dbConnection {

    private static String url = "jdbc:mysql://localhost:3306/sys";
    private static String username = "root";
    private static String password = "kvnmaria@12";
    private static final String driverName = "com.mysql.cj.jdbc.Driver";
    private static Connection con;


    public static Connection getConnection(){

        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection.");
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found.");
        }
        return con;
    }

}
