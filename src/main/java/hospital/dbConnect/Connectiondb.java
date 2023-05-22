package hospital.dbConnect;

import java.sql.*;

public class Connectiondb {
    static String url= "jdbc:postgresql://localhost:5432/hospital_db";
    static String username="dev3";
    static String password= "123456Aa";
    protected static java.sql.Connection conn  ;
    protected static Statement st  ;
    protected static ResultSet rs;

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