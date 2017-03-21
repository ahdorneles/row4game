package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 06/02/17.
 */
public class NotEnoughPermissionsException extends  FileException {
    public  NotEnoughPermissionsException(){

    }

    public NotEnoughPermissionsException(String alert){
        super(alert);
    }
}
