package my.app.model.database;

import my.app.GlobalConstants;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else {
            try {
                Properties prop = new Properties();
                InputStream inputStream = DbUtil.class.getClassLoader().getResourceAsStream(GlobalConstants.DB_PROPERTIES);
                prop.load(inputStream);
                String driver = prop.getProperty(GlobalConstants.MYSQL_DRIVER);
                String url = prop.getProperty(GlobalConstants.DB_URL);
                String user = prop.getProperty(GlobalConstants.DB_USER);
                String password = prop.getProperty(GlobalConstants.DB_PASSWORD);
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);

            } catch (ClassNotFoundException | SQLException | IOException e) {
                e.printStackTrace();
            }
            return connection;
        }

    }
}
