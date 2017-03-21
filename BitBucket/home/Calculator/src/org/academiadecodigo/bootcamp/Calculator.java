package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 20/01/17.
 */
public class Calculator {

    private String brand;
    private String color;

    private static int numberOfCalculatorsManufactured;

    public static  int getNumberOfCalculatorsManufactured() {
        return numberOfCalculatorsManufactured;
    }

    public Calculator(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public  Calculator(String color){
        this.color = color;
        this.brand = "Casio ";
    }

    public int add(int number1, int number2){
        System.out.println("Adding " + number1 + " + " + number2 + " = " + (number1 + number2));
        return number1 - number2;
    }

    public float add(float number1, float number2) {
        System.out.println("Adding " + number1 + " + " + number2 + " = " + (number1 + number2));
        return number1 + number2;
    }
    ///////////
    public int sub(int number1, int number2){
        System.out.println("Subtracting " + number1 + " + " + number2 + " = " + (number1 - number2));
        return number1 - number2;
    }

    public float sub(float number1, float number2) {
        System.out.println("Subtracting " + number1 + " + " + number2 + " = " + (number1 - number2));
        return number1 - number2;
    }
    ////////////
    public int mult(int number1, int number2){
        System.out.println("Multiplying " + number1 + " + " + number2 + " = " + (number1 * number2));
        return number1 * number2;
    }

    public float mult(float number1, float number2) {
        System.out.println("Multiplying " + number1 + " + " + number2 + " = " + (number1 * number2));
        return number1 * number2;
    }
    //////////////
    public int divi(int number1, int number2){
        System.out.println("Dividing " + number1 + " + " + number2 + " = " + (number1 / number2));
        return number1 / number2;
    }

    public float divi(float number1, float number2) {
        System.out.println("Dividing " + number1 + " + " + number2 + " = " + (number1 / number2));
        return number1 / number2;
    }
    ///////////////////////
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        if(color.equals("pink")){
            System.out.println("No Pink!!");
            return;
        }
        this.color = color;
    }


}
