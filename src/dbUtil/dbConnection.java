package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

    private static final String USENAME="dbuser";
    private static final String PASSWORD="dppassword";
    private static final String CONN="jbdc:mysql://localhost/login";
    private static final String SQCONN="jbdc:sqlite:school.sqlite";

    public static Connection getConnection() throws SQLException {

        try {
            Class.forName("org.sqlite.JBDC");
            return DriverManager.getConnection(SQCONN);
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();

        }
        return null;
    }
}
