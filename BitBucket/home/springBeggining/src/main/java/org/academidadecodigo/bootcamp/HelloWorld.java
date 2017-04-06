package org.academidadecodigo.bootcamp;

/**
 * Created by codecadet on 27/03/17.
 */
public class HelloWorld {
    private String message;

    public HelloWorld() {

    }

    public HelloWorld(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void talk() {
        System.out.println(message);
    }
}
