package org.academiadecodigo.bootcamp.persistence.hibernate;

import org.hibernate.Session;

/**
 * Created by codecadet on 23/03/17.
 */
public class HibernateTransactionManager implements TransactionManager {


    @Override
    public Session getSession() {
        return HibernateSessionManager.getSession();
    }

    @Override
    public Session beginTransaction() {
        return HibernateSessionManager.beginTransaction();

    }

    @Override
    public void close() {
        HibernateSessionManager.close();
    }

    @Override
    public void commitTransaction() {
        HibernateSessionManager.commitTransaction();
    }

    @Override
    public void rollbackTransaction() {
        HibernateSessionManager.rollbackTransaction();
    }
}
