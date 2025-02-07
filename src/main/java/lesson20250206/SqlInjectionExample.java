package lesson20250206;

import java.sql.*;
import java.util.Scanner;

public class SqlInjectionExample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        try (
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
            Statement statement = connection.createStatement();
        ) {
            statement.setFetchSize(5);
            System.out.println("Enter city id...");
            Scanner scanner = new Scanner(System.in);
            String id = scanner.nextLine();
            ResultSet resultSet = statement.executeQuery("select city.name, city.population from city where city.id = " + id);
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + ", ");
                }
                System.out.print("\n");
            }
        }
    }

}
