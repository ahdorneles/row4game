package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 06/02/17.
 */
public class NotEnoughSpaceException extends FileException {

    public NotEnoughSpaceException(){

    }
    public NotEnoughSpaceException(String alert) {
        super(alert);
    }
}
