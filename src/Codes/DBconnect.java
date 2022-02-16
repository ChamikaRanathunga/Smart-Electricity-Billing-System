package Codes;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DBconnect {

    private static Connection conn;

    public static Connection connect() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/electricity", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }

    public static void iud(String sql) throws Exception {
        if (conn == null) {
            connect();
        }
        conn.createStatement().executeUpdate(sql);
    }

    public static ResultSet search(String sql) throws Exception {
        if (conn == null) {
            connect();
        }
        return conn.createStatement().executeQuery(sql);
    }
}
