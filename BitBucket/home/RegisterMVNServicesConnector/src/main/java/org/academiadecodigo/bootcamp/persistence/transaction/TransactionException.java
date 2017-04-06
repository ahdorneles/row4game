package org.academiadecodigo.bootcamp.persistence.transaction;

/**
 * Created by codecadet on 23/03/17.
 */
public class TransactionException extends RuntimeException {
    public TransactionException(String message) {
        super(message);
    }

    public TransactionException(Throwable cause) {
        super(cause);
    }

    public TransactionException(String message, Throwable cause) {
        super(message, cause);
    }
}
