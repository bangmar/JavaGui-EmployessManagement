package tubes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class openKoneksi {

    private static Connection mysql;
    public static Connection configDB() throws SQLException {
        try {

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); 
            mysql=DriverManager.getConnection("jdbc:mysql://localhost:3306/tubes",
                          "root", "Majalengka17"); 
            System.out.println("conneeted to database");
        } catch (SQLException e) {
            System.out.println("not connected " + e.getMessage());
        }

        return mysql;
    }
}
