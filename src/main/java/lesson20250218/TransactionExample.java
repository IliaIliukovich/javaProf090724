package lesson20250218;

import java.sql.*;

public class TransactionExample {

    public static void main(String[] args) {

        try (
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
            Statement statement = connection.createStatement();
        ) {
            connection.setAutoCommit(false);

            try {
                statement.execute("insert into city (Name, CountryCode, Population) values ('New City1', 'USA', 1);");
                statement.execute("insert into city (Name, CountryCode, Population) values ('New City2', 'USA', 1);");

                Savepoint point1 = connection.setSavepoint("Point1");

                try {
                    statement.execute("insert into city (Name, CountryCode, Population) values ('New City4', 'USA', 1);");
                    statement.execute("insert into city (Name, CountryCode, Population) values ('New City3', 'USA', 1);");
                    System.out.println(1 / 0);
                } catch (ArithmeticException e) {
                    connection.rollback(point1);
                }

                connection.commit();

            } catch (SQLException e) {
                connection.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
