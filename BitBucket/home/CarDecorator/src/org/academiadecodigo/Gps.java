package org.academiadecodigo;

/**
 * Created by codecadet on 14/02/17.
 */
public class Gps extends CarDecorator {
    private int price = 200;
    private String name = "GPS";


    public Gps(Car car){
        super(car);
    }

    public int getPrice() {
        int finalPrice = super.getPrice() + price;
        System.out.println(finalPrice);
        return finalPrice;
    }

    public String getAccessories() {
        String names = super.getAccessories() + name;
        System.out.println(names);
        return names;
    }
}
