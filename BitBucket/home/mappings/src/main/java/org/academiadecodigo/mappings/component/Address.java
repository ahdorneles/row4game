package org.academiadecodigo.mappings.component;

/**
 * Created by tekman on 21/03/2017.
 */
public class Address {

    private String street;
    private String city;
    private String number;

    public Address() {
    }

    public Address(String street, String city, String number) {
        this.street = street;
        this.city = city;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
