package org.academiadecodigo.bootcamp.util;

/**
 * Created by codecadet on 10/02/17.
 */
public enum CardType {
    ACE(11),
    SEVEN(10),
    KING(4),
    JACK(3),
    QUENN(2),
    SIX(0),
    FIVE(0),
    FOR(0),
    THREE(0),
    TWO(0);


    private int value;

     CardType(int value) {
         this.value = value;
    }
}
