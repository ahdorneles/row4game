package org.academiadecodigo.bootcamp.model.dao.hibernate;

import org.academiadecodigo.bootcamp.model.dao.Dao;
import org.academiadecodigo.bootcamp.persistence.hibernate.HibernateSessionManager;
import org.academiadecodigo.bootcamp.persistence.transaction.TransactionException;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Created by codecadet on 24/03/17.
 */
public abstract class AbstractDao<T> implements Dao<T> {
    private HibernateSessionManager hibernateSessionManager;


    /*public AbstractDao(Class<T> tClass, HibernateSessionManager hibernateSessionManager) {
        this.tClass = tClass;
        this.hibernateSessionManager = hibernateSessionManager;
    }*/

    public void create(T genericObject){
        Session session;

        try {
             session = hibernateSessionManager.getSession();
            session.save(genericObject);
        } catch (HibernateException ex) {
            throw new TransactionException(ex);
        }
    }

    public void update(T genericObject){
        Session session;
        try {
             session = hibernateSessionManager.getSession();
            session.update(genericObject);
        } catch (HibernateException ex) {
            throw new TransactionException(ex);
        }
    }

    public void delete(T genericObject){
        Session session;

        try {

             session = hibernateSessionManager.getSession();
            session.delete(genericObject);
        } catch (HibernateException ex) {
            throw new TransactionException(ex);
        }
    }

    public HibernateSessionManager getHibernateSessionManager() {
        return hibernateSessionManager;
    }

    public void setHibernateSessionManager(HibernateSessionManager hibernateSessionManager) {
        this.hibernateSessionManager = hibernateSessionManager;
    }
}
