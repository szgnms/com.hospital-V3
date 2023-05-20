package hospital.dbConnect;

import java.sql.*;

public class Connection {
    static String url= "jdbc:postgresql://localhost:5432/hospital_db";
    static String username="dev3";
    static String password= "123456Aa";
    static java.sql.Connection conn  ;
    static Statement st  ;
    static ResultSet rs;
    static {

        try {
            conn = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        try {
            st=conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}