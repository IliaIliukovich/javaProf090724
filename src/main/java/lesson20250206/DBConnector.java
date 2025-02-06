package lesson20250206;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConnector {

    public Connection getConnection() throws SQLException {
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        String url = bundle.getString("db.url");
        String name = bundle.getString("db.name");
        String user = bundle.getString("db.user");
        String password = bundle.getString("db.password");
        return DriverManager.getConnection(url + "/" + name, user, password);
    }

}
