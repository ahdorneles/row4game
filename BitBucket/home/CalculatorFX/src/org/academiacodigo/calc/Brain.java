package org.academiacodigo.calc;

/**
 * Created by codecadet on 02/03/17.
 */
public class Brain {
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
}
