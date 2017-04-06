package org.academiadecodigo.bootcamp.model.dao.hibernate;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.model.dao.Dao;
import org.academiadecodigo.bootcamp.persistence.hibernate.HibernateSessionManager;
import org.academiadecodigo.bootcamp.persistence.transaction.TransactionException;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Created by codecadet on 24/03/17.
 */
public abstract class AbstractDao<T> implements Dao<T> {
    private Session session;

    public void create(T genericObject){
        try {
            session = HibernateSessionManager.getSession();
            session.save(genericObject);
        } catch (HibernateException ex) {
            throw new TransactionException(ex);
        }
    }

    public void update(T genericObject){
        try {
            session = HibernateSessionManager.getSession();
            session.update(genericObject);
        } catch (HibernateException ex) {
            throw new TransactionException(ex);
        }
    }

    public void delete(T genericObject){
        try {

            session = HibernateSessionManager.getSession();
            session.delete(genericObject);
        } catch (HibernateException ex) {
            throw new TransactionException(ex);
        }
    }
}
