package lesson20241205.iostreams;

import java.io.Serializable;

public class Address implements Serializable {

    private String city;

    private String street;


    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
