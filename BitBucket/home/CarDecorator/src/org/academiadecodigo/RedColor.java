package org.academiadecodigo;

/**
 * Created by codecadet on 14/02/17.
 */
public class RedColor extends CarDecorator {
    private int price = 300;
    private String name = "Red Color";

    public RedColor(Car car){
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
