/*package org.academiadecodigo.bootcamp.persistence.hibernate;

import org.hibernate.Session;

*
 * Created by codecadet on 23/03/17.

public class HibernateTransactionManager implements TransactionManager {
    private HibernateSessionManager hibernateSessionManager;

    @Override
    public Session getSession() {
        return hibernateSessionManager.getSession();
    }

    @Override
    public Session beginTransaction() {
        return hibernateSessionManager.beginTransaction();

    }

    @Override
    public void close() {
        hibernateSessionManager.close();
    }

    @Override
    public void commitTransaction() {
        hibernateSessionManager.commitTransaction();
    }

    @Override
    public void rollbackTransaction() {
        hibernateSessionManager.rollbackTransaction();
    }

    public void setHibernateSessionManager(HibernateSessionManager hibernateSessionManager) {
        this.hibernateSessionManager = hibernateSessionManager;
    }
}*/
