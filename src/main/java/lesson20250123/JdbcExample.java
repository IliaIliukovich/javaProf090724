package lesson20250123;

import java.sql.*;

public class JdbcExample {

    public static void main(String[] args) {
//        Class.forName("com.mysql.jdbc.Driver");
        try (
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from city");
            ) {
            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();
            String columnDate1 = resultSet.getString(1);
            String columnDate2 = resultSet.getString(2);
            String columnDate3 = resultSet.getString(3);
            String columnDate4 = resultSet.getString(4);
            String columnDate5 = resultSet.getString(5);
            System.out.println(columnDate1 + " " + columnDate2 + " " + columnDate3 + " " + columnDate4 + " " + columnDate5);

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + " --- ");
                }
                System.out.println();
            }

//            resultSet.close();
//            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
