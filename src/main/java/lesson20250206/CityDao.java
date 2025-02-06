package lesson20250206;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CityDao implements WorldDAO<City, Integer> {

    private final DBConnector connector;
    private static final String GET_ALL = "select * from city";
    private static final String GET_CITY_BY_ID = "select * from city where city.id = ?";
    private static final String SAVE_CITY = "insert into city (Name, CountryCode, District, Population) values (?, ?, ?, ?)";

    public CityDao(DBConnector connector) {
        this.connector = connector;
    }

    @Override
    public List<City> getAll() {
        try (
            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();
            ) {
            ResultSet resultSet = statement.executeQuery(GET_ALL);
            List<City> cities = new ArrayList<>();
            while (resultSet.next()){
                City city = getCityfromResultSet(resultSet);
                cities.add(city);
            }
            return cities;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private City getCityfromResultSet(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("ID");
        String name = resultSet.getString("Name");
        String countryCode = resultSet.getString("CountryCode");
        String district = resultSet.getString("District");
        int population = resultSet.getInt("Population");
        return new City(id, name, countryCode, district, population);
    }

    @Override
    public Optional<City> getById(Integer id) {
        try (
                Connection connection = connector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(GET_CITY_BY_ID);
        ) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                City city = getCityfromResultSet(resultSet);
                return Optional.of(city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public void save(City data) {
        try (
            Connection connection = connector.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE_CITY);
        ) {
            preparedStatement.setString(1, data.getName());
            preparedStatement.setString(2, data.getCountryCode());
            preparedStatement.setString(3, data.getDistrict());
            preparedStatement.setInt(4, data.getPopulation());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public City update(City data) { // TODO
        // update -----> select
        return null;
    }

    @Override
    public void delete(Integer integer) { // TODO

    }
}
