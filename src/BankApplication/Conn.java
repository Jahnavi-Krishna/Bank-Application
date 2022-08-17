package BankApplication;

import java.sql.*;

public class Conn {

    Connection c;
    public Conn() {
        try {
//            Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
