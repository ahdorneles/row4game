package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 20/01/17.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator("Casio ", " White");

        Calculator calc2 = new Calculator("Ti" , " Black");


        System.out.println("Calculator is a " + calc.getBrand() + "of color" + calc.getColor());
        System.out.println("Calculator is a " + calc2.getBrand() + "of color" + calc2.getColor());

        Calculator calc3 = new Calculator("Texas ", " Red");

        Calculator calc4 = new Calculator(" Blue");



        calc.add(3, 2);


    }
}
