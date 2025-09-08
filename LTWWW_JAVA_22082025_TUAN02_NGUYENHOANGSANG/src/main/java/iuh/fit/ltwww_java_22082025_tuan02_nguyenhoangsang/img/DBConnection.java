package iuh.fit.ltwww_java_22082025_tuan02_nguyenhoangsang.img;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String JDBC_URL =
            "jdbc:mariadb://localhost:3306/uploadfileservletdb";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "12345";
    static {
        try {

            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws
            SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER,
                JDBC_PASSWORD);
    }
}
