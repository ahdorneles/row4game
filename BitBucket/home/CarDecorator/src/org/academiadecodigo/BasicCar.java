package org.academiadecodigo;

/**
 * Created by codecadet on 14/02/17.
 */
public class BasicCar implements Car {
    private int BasePrice = 10000;

    @Override
    public int getPrice() {
        System.out.println(BasePrice);
        return BasePrice;
    }

    @Override
    public String getAccessories() {
        return "";
    }
}
