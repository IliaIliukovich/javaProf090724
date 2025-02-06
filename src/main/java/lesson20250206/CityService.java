package lesson20250206;

import java.util.List;
import java.util.Optional;

public class CityService {

    public static void main(String[] args) {
        CityDao cityDao = new CityDao(new DBConnector());


        Optional<City> optional = cityDao.getById(24);
        System.out.println(optional.orElse(null));

        cityDao.save(new City(0, "Dream City2", "USA", "", 1));

        List<City> all = cityDao.getAll();
        all.forEach(System.out::println);
    }


}
